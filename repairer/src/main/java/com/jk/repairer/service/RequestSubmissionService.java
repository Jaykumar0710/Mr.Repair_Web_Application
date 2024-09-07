package com.jk.repairer.service;

import com.jk.repairer.model.RequestSubmission;
import com.jk.repairer.repository.RequestSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestSubmissionService {
    @Autowired
    private RequestSubmissionRepository requestSubmissionRepository;

    public void saveRequestSubmission(RequestSubmission requestSubmission){
        requestSubmissionRepository.save(requestSubmission);
    }

    public RequestSubmission findById(Long id){
        return requestSubmissionRepository.findById(id).orElse(null);
    }
}
