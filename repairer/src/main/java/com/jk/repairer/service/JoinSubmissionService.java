package com.jk.repairer.service;

import com.jk.repairer.model.JoinSubmission;
import com.jk.repairer.repository.JoinSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinSubmissionService {

    @Autowired
    private JoinSubmissionRepository joinSubmissionRepository;

    public void saveJoinSubmission(JoinSubmission joinSubmission) {
        joinSubmissionRepository.save(joinSubmission);
    }
}
