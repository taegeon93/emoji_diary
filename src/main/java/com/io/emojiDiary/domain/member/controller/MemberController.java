package com.io.emojiDiary.domain.member.controller;

import com.io.emojiDiary.domain.member.dto.LoginDto;
import com.io.emojiDiary.domain.member.service.MemberService;
import com.io.emojiDiary.model.Member;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
public class MemberController {

    private final MemberService memberService;

    @RequestMapping("/signup")
    public String insertMember(@ModelAttribute Member member, HttpSession session) {
        int result = memberService.insertMember(member);
        if (result > 0) {
            session.setAttribute("message", "회원가입에 성공하셨습니다.");
            return "redirect:/";
        } else {
            session.setAttribute("message", "회원가입 실패.");
            return "redirect:/";
        }

    }

    @RequestMapping("/login")
    public String loginMember(@ModelAttribute LoginDto loginDto, HttpSession session, Model model) {
        Member user = memberService.loginMember(loginDto);
        if (user == null) {
            session.setAttribute("message", "잘못된 아이디/비밀번호 입니다.");
            return "redirect:/";
        } else {
            session.setAttribute("user", user);
            return "main";
        }

    }

    @RequestMapping("/signupForm")
    public String signupForm() {
        return "signUp";
    }

    @ResponseBody
    @RequestMapping("/search")
    public String search(String data){
        long result = memberService.searchMember(data);
        
        if(result<1){
            return "ok";
        }else{
            return "no";
        }
    }

}
