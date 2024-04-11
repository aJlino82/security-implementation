package br.lino.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/main"})
public class HomeController {
    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @GetMapping
    public String publicHello() {
        return "main";
    }

    @GetMapping("hello")
    public String protectedello() {
        return "protect-hello";
    }
}
