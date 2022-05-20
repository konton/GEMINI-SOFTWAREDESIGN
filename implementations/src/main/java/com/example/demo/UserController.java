package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser (@RequestParam String name
            , @RequestParam String email, @RequestParam String password , @RequestParam(required=false, defaultValue="Astronomer") String role) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        n.setPassword(password);
        n.setRole(role);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
    @GetMapping("/ShowAllUserPage")
    public String DisplayPage(Model model) {
        // This returns a JSON or XML with the users
        model.addAttribute("ListOfAllUser", getAllUsers());
        return "ShowAllUserPage";
    }
}