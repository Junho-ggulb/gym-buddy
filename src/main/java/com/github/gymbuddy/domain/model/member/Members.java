package com.github.gymbuddy.domain.model.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Members {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthdate;
    private Gender gender;
    private MembershipType membershipType;
    private LocalDateTime joinDate;
    private String profileImage;
    private MemberStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
