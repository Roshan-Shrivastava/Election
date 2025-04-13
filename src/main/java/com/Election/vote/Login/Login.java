package com.Election.vote.Login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {

    private int id;
    private String voterId;
    private String votingDate;

    public String getVoterId(){
        return this.voterId;
    }
    public void setVoterId( String voterId){
        this.voterId=voterId;
    }


    
    public void setVotingDate( String votingDate){
        this.votingDate=votingDate;
    }
}

