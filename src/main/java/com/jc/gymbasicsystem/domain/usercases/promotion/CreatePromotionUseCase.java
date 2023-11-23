package com.jc.gymbasicsystem.domain.usercases.promotion;

import com.jc.gymbasicsystem.application.dto.promotion.CreatePromotionDto;
import com.jc.gymbasicsystem.domain.entities.PromotionEntity;
import com.jc.gymbasicsystem.domain.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePromotionUseCase {

    @Autowired
    private PromotionRepository promotionRepository;

    public CreatePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public PromotionEntity execute(CreatePromotionDto createPromotionDto) {
        PromotionEntity promotion = new PromotionEntity();
        promotion.setName(createPromotionDto.name);
        promotion.setDescription(createPromotionDto.description);
        promotion.setDiscount(createPromotionDto.discount);
        promotion.setStartDate(createPromotionDto.startDate);
        promotion.setEndDate(createPromotionDto.endDate);
        promotion.setActive(true);

        return promotionRepository.save(promotion);
    }
}
