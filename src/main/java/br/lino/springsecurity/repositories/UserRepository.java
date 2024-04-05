package br.lino.springsecurity.repositories;

import br.lino.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}