package br.lino.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/hello"})
public class HomeController {

    @GetMapping("hello")
    public String publicHello() {
        return "hello";
    }

    @GetMapping("pro-hello")
    public String protectedello() {
        return "protect-hello";
    }
}
