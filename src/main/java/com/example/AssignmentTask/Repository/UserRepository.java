package com.example.AssignmentTask.Repository;

import com.example.AssignmentTask.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
