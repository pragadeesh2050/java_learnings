package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "hello-world-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "process-form";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processForm(HttpServletRequest request, Model model ){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        model.addAttribute("capitalName", "Yes! "+ name);
        return "process-form";
    }

    @RequestMapping("/processFormVersionThree")
    public String processForm(@RequestParam("studentName") String name, Model model ){
        name = name.toUpperCase();
        model.addAttribute("capitalName", "Yes! "+ name);
        return "process-form";
    }
}
