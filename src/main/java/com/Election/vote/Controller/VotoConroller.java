package com.Election.vote.Controller;


import com.Election.vote.LoginService.LoginService;
import com.Election.vote.Repository.LoginRepository;
import com.Election.vote.VoteCandidate.VoteCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Election.vote.Login.Login;
import com.Election.vote.*;
import  java.util.*;

@RestController
public class VotoConroller {

    List login =new ArrayList<>();

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    LoginService loginService;



    @PostMapping("/login")
    public String loginUser(@RequestBody Login login){
        System.out.println(login.getVoterId());

        return loginService.loginUser(login);
    }
    @PostMapping("/vote")
    public String voteData(@RequestBody VoteCandidate voteCandidate){
        return loginService.voteData(voteCandidate);
    }

}
