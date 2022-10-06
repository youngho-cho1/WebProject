package com.controller;

import com.dto.MemberDto;
import com.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/join/**")
@RequiredArgsConstructor
public class JoinController {
    private final JoinService service;
    @GetMapping("join")
    public String join(Model model){
        model.addAttribute("info",MemberDto.class);
        return "join";
    }
    @PostMapping("joindo")
    public String joinDo(MemberDto memberdto){
        service.insert();
        return "redirect:/login";
    }
}
