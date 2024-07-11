package com.io.emojiDiary.domain.member.service;


import com.io.emojiDiary.domain.member.dto.LoginDto;
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

    public int insertMember(Member m){

        return memberMapper.insertMember(m);

    }

    public Member loginMember(LoginDto loginDto) {
        return memberMapper.loginMember(loginDto);
    }

    public long searchMember(String data) {
        return memberMapper.searchMember(data);
    }
}
