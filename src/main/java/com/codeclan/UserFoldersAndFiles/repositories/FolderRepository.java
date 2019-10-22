package com.codeclan.UserFoldersAndFiles.repositories;

import com.codeclan.UserFoldersAndFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}