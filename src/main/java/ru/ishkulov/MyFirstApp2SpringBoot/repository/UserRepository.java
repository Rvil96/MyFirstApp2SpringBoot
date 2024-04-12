package ru.ishkulov.MyFirstApp2SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ishkulov.MyFirstApp2SpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
