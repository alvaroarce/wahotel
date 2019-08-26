package com.aws.codestar.projecttemplates.repository;

import com.aws.codestar.projecttemplates.model.Reserve_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve_User, Long>{
}
