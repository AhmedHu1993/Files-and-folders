package com.codeclan.UserFoldersAndFiles.components;

import com.codeclan.UserFoldersAndFiles.models.File;
import com.codeclan.UserFoldersAndFiles.models.Folder;
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

        User user1 = new User("Doola");
        User user2 = new User("Dod");
        userRepository.save(user1);
        userRepository.save(user2);

        Folder folder1 = new Folder("Downloads", user1);
        Folder folder2 = new Folder("Desktop", user2);
        Folder folder3 = new Folder("Documents", user1);
        Folder folder4 = new Folder("Pictures", user2);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);

        File file1 = new File("ticked", ".pdf", 235.5, folder1);
        File file2 = new File("screenshot", ".jpg", 45, folder2);
        File file3 = new File("resume", ".docs", 60.7, folder3);
        File file4 = new File("IsleOfSky", ".Jpg", 970.7, folder4);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
    }
}
