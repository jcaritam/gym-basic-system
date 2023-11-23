package com.jc.gymbasicsystem.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "member_entity")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    public String memberId;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name = "last_name", nullable = false)
    public String lastName;

    @Column(name = "email", nullable = false, unique = true)
    public String email;

    @Column(name = "phone_number", nullable = false)
    public String phoneNumber;

    @Column(name = "dni", nullable = false, unique = true)
    public String dni;

    @Column(name = "date_of_birth", nullable = false)
    public String dateOfBirth;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DailyIncomeEntity> dailyIncomeEntities = new HashSet<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MemberPlanEntity> memberPlanEntities = new HashSet<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AttendanceEntity> attendanceEntities = new HashSet<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GroupClassRegistrationEntity> groupClassRegistrationEntities = new HashSet<>();
}
