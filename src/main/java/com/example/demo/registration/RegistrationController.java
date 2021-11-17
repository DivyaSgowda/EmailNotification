package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(path= "register")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "emailconfirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }


//    @PostMapping(path = "accountverify")
//    public String accountverification(@RequestBody String email) {
//        return registrationService.accountVerification(email);
//    }

    @GetMapping(path = "accountconfirm")
    public String accountconfirm(@RequestParam("token") String token) {
        return registrationService.confirmTokenAccount(token);
    }

}
