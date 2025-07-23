package springmvc.controller;

import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.services.UserServices;

@Controller
public class contactController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/contact")
    public String showForm(Model m){
        m.addAttribute("Header","Let's Get To Know YOU !");
        return "contact";
 }
 //using ModelAttribute
    @RequestMapping(path = "/processform" , method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
//        userServices.createUser(user);
        System.out.println("creating user");
        return "registerConfirmetion";
    }

    //using RequestParam
//    @RequestMapping(path = "/processform" , method = RequestMethod.POST)
//    public String handleForm(@RequestParam("name") String userName , @RequestParam("email") String userEmail , @RequestParam("password") String userPassword,
//                             Model springmvc.model){
//        System.out.println("User name is "+ userName);
//        System.out.println("User email is "+ userEmail);
//        System.out.println("User pass is "+ userPassword);
//
//        springmvc.model.addAttribute("name",userName);
//        springmvc.model.addAttribute("email",userEmail);
//        springmvc.model.addAttribute("password",userPassword);
//
//        return "registerConfirmetion";
//    }
}
