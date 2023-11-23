package com.jc.gymbasicsystem.application.dto.promotion;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePromotionDto {
    public String name;
    public String description;
    public float discount;
    public LocalDate startDate;
    public LocalDate endDate;
}
