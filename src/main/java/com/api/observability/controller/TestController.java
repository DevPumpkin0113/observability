package com.api.observability.controller;

import com.api.observability.dto.TestDTO;
import com.api.observability.service.TestService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    private final TestService testService;

    @GetMapping("/save")
    public ResponseEntity<Void> saveData() {
        testService.saveAllData();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find/{pathId}")
    public ResponseEntity<TestDTO> getData(@PathVariable Long pathId) {
        log.info("pathId: {}", pathId);
        return ResponseEntity.ok(testService.getData(pathId));
    }
}
