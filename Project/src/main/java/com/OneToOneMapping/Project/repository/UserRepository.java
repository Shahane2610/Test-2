package com.OneToOneMapping.Project.repository;

import com.OneToOneMapping.Project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
