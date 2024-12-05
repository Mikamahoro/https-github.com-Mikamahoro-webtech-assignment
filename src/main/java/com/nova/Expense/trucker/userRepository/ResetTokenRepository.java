package com.nova.Expense.trucker.userRepository;

import com.nova.Expense.trucker.model.ResetToken;
import com.nova.Expense.trucker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    void deleteByToken(String token);
    Optional<ResetToken> findByUser(User user);
    Optional<ResetToken> findByToken(String token);
}