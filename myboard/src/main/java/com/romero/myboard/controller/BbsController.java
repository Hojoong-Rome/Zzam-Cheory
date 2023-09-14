package com.romero.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.romero.myboard.dto.BbsDto;
import com.romero.myboard.service.BbsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bbs")
public class BbsController {

    private final BbsService bbsService;

    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BbsDto bbsDto){  //@RequestParam("bbsWriter") String bbsWriter 전통적으로 받는 방법
        System.out.println("bbsDto = " + bbsDto);
        bbsService.save(bbsDto);
        return "index";
    }

}
