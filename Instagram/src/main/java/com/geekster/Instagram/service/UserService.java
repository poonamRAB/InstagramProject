package com.geekster.Instagram.service;

import com.geekster.Instagram.dto.SignInInput;
import com.geekster.Instagram.dto.SignUpInput;
import com.geekster.Instagram.dto.SignUpOutput;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    IUserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;

    public String signInUser(SignInInput signInInput) {

        String signInStatus = null;

        String signInEmail = signInInput.getEmail();

        if(signInEmail == null ){
            signInStatus = "Invalid Email-Id";
            return signInStatus;
        }

        User exitingUser = userRepo.findFirstByEmail(signInEmail);

        if(exitingUser == null ){
            signInStatus = "This Email is not registerd!!";
            return signInStatus;
        }

        return "sign In successfully!!!";
    }



    public String signUpUser(User user) {

        boolean signUpStatus = true;
        String signUpStatusMsg = null;

        String newEmail = user.getEmail();

        if( newEmail == null){
            signUpStatusMsg = "Invalid mailId!!";
            signUpStatus = false;

            return new SignUpOutput(signUpStatus,signUpStatusMsg);
        }


        User existingUser = userRepo.findFirstByEmail(newEmail);

        if(existingUser != null){
            signUpStatusMsg = "This mail already exists!!";
            signUpStatus = false;

            return new SignUpOutput(HttpStatus.OK,signUpStatusMsg);
        }

        return "sign up Successfully!!";
    }

    public String updateDetail(User user, User email) {

    }
}
