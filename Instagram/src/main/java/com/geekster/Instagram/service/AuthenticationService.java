package com.geekster.Instagram.service;

import com.geekster.Instagram.model.AuthenticationToken;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.repository.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;

    public boolean authenticate(String email, String tokenValue){
        AuthenticationToken authenticationToken = authenticationTokenRepo.findFirstByToken(tokenValue);

        if(authenticationToken == null ){
            return false;
        }

        String tokenEmail = authenticationToken.getUser().getEmail();

        return tokenEmail.equals(email);
    }

    public void saveAuthenticationToken(AuthenticationToken authenticationToken){
        authenticationTokenRepo.save(authenticationToken);
    }

    public AuthenticationToken findByUser(User user){
        return authenticationTokenRepo.findByUser(user);
    }

    public AuthenticationToken findFirstByToken(String token){
        return authenticationTokenRepo.findFirstByToken(token);
    }
}
