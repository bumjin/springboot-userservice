package me.bumjin.demolearnspringboot.repository;

import me.bumjin.demolearnspringboot.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDomain, Long> {

}
