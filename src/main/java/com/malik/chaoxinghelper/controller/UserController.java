package com.malik.chaoxinghelper.controller;


import com.malik.chaoxinghelper.dao.entity.User;
import com.malik.chaoxinghelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author MalikCheng
 * @since 2020-02-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public User hello(@RequestParam(value = "id") int id) {
        User user = userService.getById(id);
        return user;
    }
}

