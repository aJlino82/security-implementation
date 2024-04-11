package br.lino.springsecurity.datamocks;

import br.lino.springsecurity.entity.security.User;
import br.lino.springsecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import static br.lino.springsecurity.entity.security.enums.Roles.ADMIN;

@Component
public class DataPopulator implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "user", passwordEncoder.encode("1234"), "teste@gmail.com", ADMIN);
        userRepository.save(user);
    }
}
