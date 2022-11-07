package com.mustache.notice_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/* RestController 대신 Controller 어노테이션이 들어간다. */
@Controller
public class MustacheController {

    @GetMapping(value="/salute/{id}")
    public String mustacheCon(Model model, @PathVariable String id) {
        model.addAttribute("username", id); // view 에 값을 넘기겠다는 의미
        return "greetings"; // greetings 라는 이름의 view 를 리턴한다
    }

}
