package ua.com.qqq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.qqq.dao.UserDao;
import ua.com.qqq.models.User;

@Controller
public class mainController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    public String save(User user) {
        System.out.println(user);
        userDao.save(user);
        return "index";
    }
}
