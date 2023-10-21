package com.jc.gymbasicsystem.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDate;
import java.util.Set;

@Entity(name = "promotion_entity")
@EqualsAndHashCode(callSuper = true)
public class PromotionEntity extends BaseEntity {

    @Id
    @UuidGenerator
    @Column(name = "promotion_id", updatable = false, nullable = false)
    public String promotionId;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "description", nullable = false)
    public String description;

    @Column(name = "discount", nullable = false)
    public float discount;

    @Column(name = "start_date", nullable = false)
    public LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    public LocalDate endDate;

    @OneToMany(mappedBy = "promotion")
    private Set<MemberPlanEntity> memberPlans;
}