package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "로그인 되었습니다.";
    }

    @GetMapping("/logout")
    public String logout() {
        return "로그아웃 되었습니다.";
    }

    @GetMapping("/signup")
    public String signup() {
        return "회원가입 되었습니다.";
    }

    /*@PostMapping("/signup")
    public String registerUser(SignupRequestDto requestDto) {
        // ...
    }*/
}