package com.github.gymbuddy.domain.model.member;

import lombok.Getter;

@Getter
public enum Gender {
    M("남자"),F("여자");

    final String description;

    Gender(String description) {
        this.description = description;
    }
}
