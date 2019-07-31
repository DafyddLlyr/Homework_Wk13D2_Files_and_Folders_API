package com.codelcan.example.fileservice.components;

import com.codelcan.example.fileservice.models.File;
import com.codelcan.example.fileservice.models.Folder;
import com.codelcan.example.fileservice.models.User;
import com.codelcan.example.fileservice.repositories.FileRepository;
import com.codelcan.example.fileservice.repositories.FolderRepository;
import com.codelcan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Dafydd");
        userRepository.save(user);

        Folder folder1 = new Folder("Test Folder 1", user);
        folderRepository.save(folder1);

        File file1 = new File("virus", ".exe", 255, folder1);
        fileRepository.save(file1);

        Folder folder2 = new Folder("Test Folder 2", user);
        folderRepository.save(folder2);

        File file2 = new File("game", ".exe", 255, folder2);
        fileRepository.save(file2);

    }
}
