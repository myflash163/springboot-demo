package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping({"/", "index.html"})
    public String index() {
        return "index";
    }

    @PostMapping({"/login", "login.html"})
    public String login() {
        /**
         * 防止首页表单重复提交
         */
        return "redirect:/dashboard";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "hello");
        map.put("user", "user");
        map.put("users", "users");
        map.put("upload", "upload");
        return "success";
    }
}
