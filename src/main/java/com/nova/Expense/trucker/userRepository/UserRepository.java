package com.nova.Expense.trucker.userRepository;

import com.nova.Expense.trucker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findByUsernameContainingOrEmailContaining(String username, String email);
}