package com.Election.vote.LoginService;

import com.Election.vote.CandidateRepository.CandidateRepository;
import com.Election.vote.LogEntity.LoginEntity;
import com.Election.vote.Repository.LoginRepository;
import com.Election.vote.VoteCandidate.VoteCandidate;
import com.Election.vote.VoteCandidate.VoteCandidateEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.Election.vote.Login.Login;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    CandidateRepository candidateRepository;

    Login loginData=new Login();


    @Override
    public String loginUser(Login login) {
        if(!(login.getVoterId().length()==10)){
            return "Invalid Voter Id";
        }
        loginData=login;
        Optional<LoginEntity> logUser=loginRepository.findByVoterId(login.getVoterId());
        if(logUser.isEmpty()){
            LoginEntity loginEntity = new LoginEntity();
            BeanUtils.copyProperties(login, loginEntity);
            loginEntity.setVoterId(login.getVoterId());
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDate = now.format(formatter);
            loginEntity.setVotingDate(formattedDate); // Current Date-Time set ho raha hai
            System.out.println(loginEntity.getVoterId());
            loginRepository.save(loginEntity);
            return "Login Successfully";
        }else{
            return "You Have Already Gave the Vote!!";
        }

    }
    public String voteData(VoteCandidate voteCandidate){
        VoteCandidateEntity voteCandidateEntity =new VoteCandidateEntity();
        BeanUtils.copyProperties(voteCandidate,voteCandidateEntity);
        voteCandidateEntity.setVoterId(loginData.getVoterId());
        voteCandidateEntity.setCandidateName(voteCandidate.getCandidateName());
        candidateRepository.save(voteCandidateEntity);

        return "You Voted For "+voteCandidate.getCandidateName();
    }
}
