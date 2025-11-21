package com.tersornpat.fulldesign.e_shopping_api.controller;

import com.tersornpat.fulldesign.e_shopping_api.entity.TestCustomerEntity;
import com.tersornpat.fulldesign.e_shopping_api.service.TestCustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test-user")
public class TestCustomerController {
    private final TestCustomerService testCustomerService;

    public TestCustomerController(TestCustomerService testCustomerService) {
        this.testCustomerService = testCustomerService;
    }

    @GetMapping("/get-test-user")
    public ResponseEntity<List<TestCustomerEntity>> getTestUser() {
        return ResponseEntity.status(HttpStatus.OK).body(testCustomerService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCustomerEntity> getTestUser(@RequestParam Long id ) {
        return ResponseEntity.status(HttpStatus.OK).body(testCustomerService.getUserById(id));
    }

}
