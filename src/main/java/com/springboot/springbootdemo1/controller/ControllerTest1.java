package com.springboot.springbootdemo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@Slf4j
public class ControllerTest1 {
//    @GetMapping(value = {"/", "/index.html"})
//    public String index() {
//        return "index";
//    }

    @GetMapping(value = "/hellothymeleaf")
    public String hellothymeleaf(Model model) {
        model.addAttribute("link", "baidu");
        model.addAttribute("link1", "http://www.baidu.com");
        model.addAttribute("msg", "hellothymeleaf");
        return "hellothymeleaf";
    }

    @GetMapping("/baidu")
    public ModelAndView baidu() throws IOException {
        log.info("~~~~~");
       return new ModelAndView("redirect:http://www.baidu.com");
    }
//    @GetMapping("/baidu")
//    public String baidu() throws IOException {
//        log.info("~~~~~");
//       return "redirect:http://www.baidu.com";
//    }
//    @GetMapping("/baidu")
//    public void baidu(HttpServletResponse response) throws IOException {
//        log.info("~~~~~");
//        response.sendRedirect("http://www.baidu.com");
//    }
}
