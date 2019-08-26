package com.aws.codestar.projecttemplates.repository;

import com.aws.codestar.projecttemplates.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
}
