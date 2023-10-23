package com.itgl.controller;

import com.itgl.Pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello world~");
        return "Hello World~";


    }

    @RequestMapping("/simple")
    public String simple(@RequestParam(name = "name", required = true) String name, Integer age) {
        System.out.println(name + ":" + age);
        return name + ":" + age;
    }

    @RequestMapping("/comsim0")
    public String comsim(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/comsim1")
    public String comsim0(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/ArrayTest")
    public String Array1(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    @RequestMapping("/ArraylistTest")
    public String Array2(@RequestParam ArrayList<String> list) {
        System.out.println(list);
        return "ok";
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date nowtime) {
        System.out.println(nowtime);
        return "ok";
    }

    @RequestMapping("/JSONTTT")
    public String JSONTest(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/path/{id}/{name}")
    public String patn(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "ok";
    }
}


