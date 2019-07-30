package com.codelcan.example.fileservice.repositories;

import com.codelcan.example.fileservice.models.User;
import com.codelcan.example.fileservice.projections.UserEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserEmbed.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
