package com.io.emojiDiary.domain.member.service;


import com.io.emojiDiary.mapper.MemberMapper;
import com.io.emojiDiary.model.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public Member insertMember(){
        Member m = new Member().builder()
                .userId("testId")
                .userPw("1234")
                .userName("test")
                .nickName("testNick")
                .phone("01031058440")
                .build();

        memberMapper.insertMember(m);
        return m;
    }
}
