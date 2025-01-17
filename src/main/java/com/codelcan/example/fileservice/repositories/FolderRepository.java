package com.codelcan.example.fileservice.repositories;

import com.codelcan.example.fileservice.models.Folder;
import com.codelcan.example.fileservice.projections.FolderEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = FolderEmbed.class)
//@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
