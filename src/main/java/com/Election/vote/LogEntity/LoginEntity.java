package com.Election.vote.LogEntity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_detail_Voting")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String voterId;
    private String votingDate;

    public String getVoterId(){
        return this.voterId;
    }

    public void setVoterId(String voterId){
       this.voterId=voterId;
    }

    public void setVotingDate( String votingDate){
        this.votingDate=votingDate;
    }
}
