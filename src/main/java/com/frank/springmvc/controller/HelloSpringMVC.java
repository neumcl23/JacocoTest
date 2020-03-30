package com.frank.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVC {
    @RequestMapping("/hello")  
    public String test(Model model) {
        model.addAttribute("message","Hello World!!!test");
        System.out.println("test"); 
        return "hello"; 
    }
    @RequestMapping("/hello2")
    public String HelloWorld(Model model){
        model.addAttribute("message","Hello World!!!spring");  
        return "hello2";  
    }  
    
    public void HelloWorld2(){  
    	 System.out.println("HelloWorld2");
    } 
    
 
    public void HelloWorld4(){  
   	 System.out.println("HelloWorld666666666");
     System.out.println("HelloWorld666666666");
   } 
    
    @RequestMapping("/hellomasterdaily")
    public String hellomasterdaily(Model model){
        model.addAttribute("message","Hello World!!!hellomasterdaily");  
        System.out.println(" in both master branch and daily ");
        return "hello2";  
    }  
    
    @RequestMapping("/hello2master")
    public String hello2master(Model model){
        model.addAttribute("message","Hello World!!!hello2master");  
        System.out.println(" in branch hello2master ");
        return "hello2";  
    }  
    
}
