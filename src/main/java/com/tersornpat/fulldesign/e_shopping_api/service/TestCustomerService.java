package com.tersornpat.fulldesign.e_shopping_api.service;

import com.tersornpat.fulldesign.e_shopping_api.entity.TestCustomerEntity;
import com.tersornpat.fulldesign.e_shopping_api.repository.TestCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCustomerService {
    private final TestCustomerRepository testCustomerRepository;

    public TestCustomerService(TestCustomerRepository testCustomerRepository) {
        this.testCustomerRepository = testCustomerRepository;
    }

    public List<TestCustomerEntity> getAllUser() {
        return testCustomerRepository.findAll();
    }

    public TestCustomerEntity getUserById(Long id) {
        return testCustomerRepository.findById(id).get();
    }
}
