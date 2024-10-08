package com.github.gymbuddy.domain.member;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

//@Mapper
public interface MemberMapper {
    void save(Member member);

    Optional<Member> findById(Long id);

    void update(@Param("id") Long id, @Param("updateParam") Member member);

    List<Member> findAll();

}
