package com.codeclan.UserFoldersAndFiles.components;

import com.codeclan.UserFoldersAndFiles.models.User;
import com.codeclan.UserFoldersAndFiles.repositories.FileRepository;
import com.codeclan.UserFoldersAndFiles.repositories.FolderRepository;
import com.codeclan.UserFoldersAndFiles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {

    }
}
