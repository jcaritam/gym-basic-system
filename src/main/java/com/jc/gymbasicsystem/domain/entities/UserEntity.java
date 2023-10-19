package com.jc.gymbasicsystem.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Entity(name = "user_entity")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity {

    @Id
    @UuidGenerator
    @Column(name = "user_id", updatable = false, nullable = false)
    public String userId;

    @Column(name = "user_name", nullable = false)
    public String username;

    @Column(name = "password", nullable = false)
    public String password;

    @Column(name = "role", nullable = false)
    public String role;
}
