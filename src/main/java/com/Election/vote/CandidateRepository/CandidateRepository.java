package com.Election.vote.CandidateRepository;

import com.Election.vote.LogEntity.LoginEntity;
import com.Election.vote.VoteCandidate.VoteCandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidateRepository extends JpaRepository<VoteCandidateEntity, Long> {

}
