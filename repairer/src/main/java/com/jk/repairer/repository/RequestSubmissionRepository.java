package com.jk.repairer.repository;

import com.jk.repairer.model.RequestSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestSubmissionRepository extends JpaRepository<RequestSubmission, Long> {
}
