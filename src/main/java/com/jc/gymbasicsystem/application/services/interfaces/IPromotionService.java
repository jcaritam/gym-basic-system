package com.jc.gymbasicsystem.application.services.interfaces;

import com.jc.gymbasicsystem.domain.entities.PromotionEntity;

import java.util.List;

public interface IPromotionService {
    List<PromotionEntity> getAllPromotions();

    PromotionEntity getPromotionById(String promotionId);

    PromotionEntity createPromotion(PromotionEntity promotionEntity);

    PromotionEntity updatePromotion(PromotionEntity promotionEntity);

    void deletePromotion(String promotionId);
}
