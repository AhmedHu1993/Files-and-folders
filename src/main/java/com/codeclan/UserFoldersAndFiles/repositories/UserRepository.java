package com.codeclan.UserFoldersAndFiles.repositories;

import com.codeclan.UserFoldersAndFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
