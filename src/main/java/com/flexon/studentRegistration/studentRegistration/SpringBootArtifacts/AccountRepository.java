package com.flexon.studentRegistration.studentRegistration.SpringBootArtifacts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Students, Integer> {

}
