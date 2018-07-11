package me.bumjin.demolearnspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import me.bumjin.demolearnspringboot.domain.UserDomain;
import me.bumjin.demolearnspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {
        log.info("hello World!");
        List<UserDomain> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/insert")
    public String insertUserDomain(UserDomain userDomain) {
        log.info("userDomain {} :" , userDomain);
        userRepository.save(userDomain);
        return "redirect:/";
    }
}
