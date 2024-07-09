package com.io.emojiDiary.mapper;

import com.io.emojiDiary.model.Member;
import org.apache.ibatis.annotations.Mapper;



public interface MemberMapper {

    void insertMember(Member member);
}
