package com.jc.gymbasicsystem.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "member_entity")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    public String memberId;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name = "last_name", nullable = false)
    public String lastName;

    @Column(name = "email", nullable = false)
    public String email;

    @Column(name = "phone_number", nullable = false)
    public String phoneNumber;

    @Column(name = "date_of_birth", nullable = false)
    public String dateOfBirth;

}
