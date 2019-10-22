package com.codeclan.UserFoldersAndFiles.repositories;

import com.codeclan.UserFoldersAndFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
