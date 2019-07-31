package com.codelcan.example.fileservice.repositories;

import com.codelcan.example.fileservice.models.File;
import com.codelcan.example.fileservice.projections.FileEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(excerptProjection = FileEmbed.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
