package com.rakuten.edc.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.edc.elasticsearch.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchCrudRepository<Employee, Long> {

    List<Employee> findByOrganizationName(String name);
    List<Employee> findByName(String name);

}
