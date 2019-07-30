package com.codelcan.example.fileservice;

import com.codelcan.example.fileservice.models.Folder;
import com.codelcan.example.fileservice.models.User;
import com.codelcan.example.fileservice.repositories.FolderRepository;
import com.codelcan.example.fileservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUser() {
		User user = new User("Dafydd");
		userRepository.save(user);
	}

}
