package net.biancheng.controller;

import net.biancheng.UserService.UserService;
import net.biancheng.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String getLogin(Model model){
        User us = new User();
        us.setName("biancheng");
        userService.login(us);
        model.addAttribute("user",us);
        return "login";
    }
    @RequestMapping("/register")
    public String getRegiser(Model model){
        User us = new User();
        us.setName("biancheng");
        userService.login(us);
        model.addAttribute("user",us);
        return "register";
    }
}
