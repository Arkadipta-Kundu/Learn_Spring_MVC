package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("this is home url");
        return "index";
    }
    @RequestMapping("/about")
    public String about(Model model){
        System.out.println("this is about url");
        model.addAttribute("name_key","Arkadipta Kundu");
        model.addAttribute("age_key",23);
        return "about";
    }
}
