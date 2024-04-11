package br.lino.springsecurity.repositories;

import br.lino.springsecurity.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String name);

    User findByEmail(String email);
}