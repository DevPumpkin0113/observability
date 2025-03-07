package com.api.observability.repository;

import com.api.observability.dto.TestDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestMemoryRepository implements TestRepository {

    private final Map<Long, TestDTO> tests = new HashMap<>();

    @Override
    public void saveAllData() {
        tests.put(1L, new TestDTO(1L, "Alice", "Context 1"));
        tests.put(2L, new TestDTO(2L, "Bob", "Context 2"));
        tests.put(3L, new TestDTO(3L, "Charlie", "Context 3"));
        tests.put(4L, new TestDTO(4L, "David", "Context 4"));
        tests.put(5L, new TestDTO(5L, "Eve", "Context 5"));
        tests.put(6L, new TestDTO(6L, "Frank", "Context 6"));
        tests.put(7L, new TestDTO(7L, "Grace", "Context 7"));
        tests.put(8L, new TestDTO(8L, "Hank", "Context 8"));
        tests.put(9L, new TestDTO(9L, "Ivy", "Context 9"));
        tests.put(10L, new TestDTO(10L, "Jack", "Context 10"));
    }

    @Override
    public TestDTO findById(long id) {
        return tests.getOrDefault(id, new TestDTO(null, "null", "null"));
    }
}
