package com.github.gymbuddy.domain.member;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MemberRepositoryImplTest {

    @Test
    @DisplayName("회원 조회")
    void findAll() {
        Member member = new Member();
        member.setName("테스트");
        member.setGender(Gender.M);

    }
}