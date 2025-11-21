package com.tersornpat.fulldesign.e_shopping_api.repository;

import com.tersornpat.fulldesign.e_shopping_api.entity.TestCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCustomerRepository extends JpaRepository<TestCustomerEntity, Integer> {
}
