package com.io.emojiDiary.domain.member.controller;

import com.io.emojiDiary.domain.member.dto.LoginDto;
import com.io.emojiDiary.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @RequestMapping("/signUp")
    public String insertMember(){

        memberService.insertMember();

        return "index";
    };
    @RequestMapping("/login")
    public String loginMember(@ModelAttribute LoginDto loginDto){
        log.info("logindto={}",loginDto);
        return "index";
    }

}
