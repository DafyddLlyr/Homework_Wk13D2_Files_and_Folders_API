package com.codelcan.example.fileservice.projections;

import com.codelcan.example.fileservice.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fileEmbed", types = File.class)
public interface FileEmbed {
    String getName();
    String getExtension();
    int getSize();
}
