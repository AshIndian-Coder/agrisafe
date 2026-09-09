package com.agro.trace.aiml.service;


public interface AiIntegrationPort {

    FraudAnalysisResponse analyzeFraud(FraudAnalysisRequest request);

    QualityAnalysisResponse analyzeQuality(QualityAnalysisRequest request);

    ImageAnalysisResponse analyzeImage(ImageAnalysisRequest request);
}


record FraudAnalysisRequest(
        String lotId,
        String packageId,
        String testerUuid,
        Object testData,
        String deviceId,
        Object historicalData
) {}

record FraudAnalysisResponse(
        double fraudScore,
        String riskLevel,
        String[] anomalies,
        boolean recommendedAction,
        String analysisId
) {}

record QualityAnalysisRequest(
        String productId,
        String varietyId,
        Object measurements,
        Object standardThresholds
) {}

record QualityAnalysisResponse(
        String qualityGrade,
        double qualityScore,
        String[] observations,
        boolean recommendedAction
) {}

record ImageAnalysisRequest(
        String imageUrl,
        String productType,
        String analysisType
) {}

record ImageAnalysisResponse(
        String defectType,
        double confidenceScore,
        String qualityEstimate,
        String analysisId
) {}
