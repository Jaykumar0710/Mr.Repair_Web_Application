package com.jk.repairer.repository;

import com.jk.repairer.model.JoinSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinSubmissionRepository extends JpaRepository<JoinSubmission, Long> {
}
