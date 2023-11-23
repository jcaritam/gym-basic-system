package com.jc.gymbasicsystem.application.services;

import com.jc.gymbasicsystem.application.services.interfaces.IPromotionService;
import com.jc.gymbasicsystem.domain.entities.PromotionEntity;

import java.util.List;

public class PromotionService implements IPromotionService {
    @Override
    public List<PromotionEntity> getAllPromotions() {
        return null;
    }

    @Override
    public PromotionEntity getPromotionById(String promotionId) {
        return null;
    }

    @Override
    public PromotionEntity createPromotion(PromotionEntity promotionEntity) {
        return null;
    }

    @Override
    public PromotionEntity updatePromotion(PromotionEntity promotionEntity) {
        return null;
    }

    @Override
    public void deletePromotion(String promotionId) {

    }
}
