package com.api.observability.repository;

import com.api.observability.dto.TestDTO;

public interface TestRepository {
    void saveAllData();
    TestDTO findById(long id);
}
