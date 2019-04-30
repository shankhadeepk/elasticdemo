package org.shan.sample.elasticdemo.repository;

import org.shan.sample.elasticdemo.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"empid\": \"?0\"}}]}}")
    Page<Employee> findByEmployeeIdCustom(String empid,Pageable pageable);
}
