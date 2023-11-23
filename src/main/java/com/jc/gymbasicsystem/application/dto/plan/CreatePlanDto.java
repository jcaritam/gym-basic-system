package com.jc.gymbasicsystem.application.dto.plan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePlanDto {
    public String name;
    public String description;
    public float price;
    public int durationDays;
}
