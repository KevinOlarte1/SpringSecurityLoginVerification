package com.kevinolarte.demo.registration;

import com.kevinolarte.demo.appuser.AppUser;
import lombok.AllArgsConstructor;
import org.springframework.security.web.webauthn.management.ImmutableRelyingPartyRegistrationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        //TODO: Verificar que el email.
        //VIDEO: Java Tutorial - Complete User Login and Registration Backend + Email Verification
        //MINUTO: 46:50.
        return registrationService.register(request);
    }
}
