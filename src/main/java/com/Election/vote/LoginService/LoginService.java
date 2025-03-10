package com.Election.vote.LoginService;

import com.Election.vote.Login.Login;
import com.Election.vote.VoteCandidate.VoteCandidate;


public interface LoginService {
   String loginUser(Login login);
   String voteData(VoteCandidate voteCandidate);
}
