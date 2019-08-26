package com.aws.codestar.projecttemplates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aws.codestar.projecttemplates.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
