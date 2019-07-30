package com.codelcan.example.fileservice.components;

import com.codelcan.example.fileservice.models.Folder;
import com.codelcan.example.fileservice.models.User;
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

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Dafydd");
        userRepository.save(user);

        Folder folder = new Folder("Test Folder", user);
        folderRepository.save(folder);

    }
}
