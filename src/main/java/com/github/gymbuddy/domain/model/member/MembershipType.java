package com.github.gymbuddy.domain.model.member;

import lombok.Getter;

@Getter
public enum MembershipType {

    NORMAL("일반"), VIP("VIP");

    final String description;

    MembershipType(String description) {
        this.description = description;
    }

}
