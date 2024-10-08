package com.github.gymbuddy.domain.model.member;

import lombok.Getter;

@Getter
public enum MemberStatus {
    ACTIVE("활성"), CANCEL("탈퇴");

    final String description;

    MemberStatus(String description) {
        this.description = description;
    }
}
