package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contactController {
    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
 }
    @RequestMapping(path = "/processform" , method = RequestMethod.POST)
    public String handleForm(@RequestParam("name") String userName , @RequestParam("email") String userEmail , @RequestParam("password") String userPassword,
                             Model model){
        System.out.println("User name is "+ userName);
        System.out.println("User email is "+ userEmail);
        System.out.println("User pass is "+ userPassword);

        model.addAttribute("name",userName);
        model.addAttribute("email",userEmail);
        model.addAttribute("password",userPassword);

        return "registerConfirmetion";
    }
}
