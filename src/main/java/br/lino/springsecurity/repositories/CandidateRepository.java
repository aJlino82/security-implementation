package br.lino.springsecurity.repositories;

import br.lino.springsecurity.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateRepository extends JpaRepository<Candidate, UUID> {

    Candidate findByNameIgnoreCase(String name);
}