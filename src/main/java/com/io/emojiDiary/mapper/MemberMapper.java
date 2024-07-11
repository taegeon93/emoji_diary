package com.io.emojiDiary.mapper;

import com.io.emojiDiary.domain.member.dto.LoginDto;
import com.io.emojiDiary.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface MemberMapper {

    int insertMember(Member member);
    Member loginMember(LoginDto member);
    long searchMember(@Param("userId")String data);
}
