package net.javaguides.springreact3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springreact3.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}