package com.jk.repairer.repository;

import com.jk.repairer.model.WorkSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkSubmissionRepository extends JpaRepository<WorkSubmission, Long> {
}
