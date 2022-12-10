package ba.sum.fsre.knjiznica.controller;

import ba.sum.fsre.knjiznica.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ba.sum.fsre.knjiznica.repositories.UserRepository;

@Controller
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping ("/register")
    public String showRegistrationForm (Model model){
        model.addAttribute("user", new User());
        return "register_form";
    }

    @PostMapping("/register_user")
    public String registerUser(User user){
        userRepository.save(user);
        return "register_form";
    }
}
