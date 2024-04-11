package br.lino.springsecurity;

import br.lino.springsecurity.entity.Candidate;
import br.lino.springsecurity.repositories.CandidateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringSecurityApplicationTests {

    private CandidateRepository repository;


    @Test
    void contextLoads() {
        var candidate = Candidate.builder().name("joao").lastName("silva").build();
        repository.save(candidate);

        assertEquals(candidate, repository.findByNameIgnoreCase(candidate.getName()));
    }

}
