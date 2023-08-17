package com.huy.shoppingWebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @GetMapping("/loginPage")
    public String loginPage(){
        return "fancy-login";
    }

    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }
}
