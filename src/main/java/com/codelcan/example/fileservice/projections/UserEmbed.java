package com.codelcan.example.fileservice.projections;

import com.codelcan.example.fileservice.models.Folder;
import com.codelcan.example.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "userEmbed", types = User.class)
public interface UserEmbed {
    String getName();
    Folder getFolders();
}
