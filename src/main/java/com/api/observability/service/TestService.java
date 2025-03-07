package com.api.observability.service;

import com.api.observability.dto.TestDTO;
import com.api.observability.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public TestDTO getData(Long pathId) {
        return testRepository.findById(pathId);
    }

    public void saveAllData() {
        testRepository.saveAllData();
    }
}
