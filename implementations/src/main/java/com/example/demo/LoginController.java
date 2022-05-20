package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String viewLoginPage(Model model) {
        // custom logic before showing login page...
        model.addAttribute("Information", new User());
        return "login";
    }

    @PostMapping("/welcome")
    public String WelcomeForm(@ModelAttribute User user, Model model, RedirectAttributes redirectAttrs) {
        Iterable<User> UserData = userRepository.findAll();
        for(User data : UserData){
            if(data.getEmail().equals(user.getEmail())){
                if(data.getPassword().equals(user.getPassword())){
                    model.addAttribute("Information", data);
                    return "welcomepage";
                }
            }
        }
        redirectAttrs.addFlashAttribute("ErrorMessage","** Invalid username and password! **");
        return "redirect:/login";
    }
}