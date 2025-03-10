package com.Election.vote.VoteCandidate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_detail_Voting_Candidate")
public class VoteCandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String voterId;
    private String candidateName;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
}
