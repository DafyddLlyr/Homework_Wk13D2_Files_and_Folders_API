package com.codelcan.example.fileservice.projections;

import com.codelcan.example.fileservice.models.File;
import com.codelcan.example.fileservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "FolderEmbed", types = Folder.class)
public interface FolderEmbed {
    String getTitle();
    List<File> getFiles();
}
