package org.example.hotrospring5.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String home(){
        return "home";
    }
    @PostMapping("/caculate")
    public String caculator(@RequestParam("Number1") int Number1, @RequestParam ("Number2") int Number2, Model model){
        System.out.println("Number1:"+ Number1);
        System.out.println("Number2:"+ Number2);
        int sum = Number1 + Number2;
        model.addAttribute("Tong2so", sum);
        return "home";
    }



}