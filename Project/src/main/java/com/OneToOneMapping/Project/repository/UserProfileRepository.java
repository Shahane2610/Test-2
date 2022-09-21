package com.OneToOneMapping.Project.repository;

import com.OneToOneMapping.Project.Entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
