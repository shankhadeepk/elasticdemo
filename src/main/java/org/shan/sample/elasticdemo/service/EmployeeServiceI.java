package org.shan.sample.elasticdemo.service;

import org.shan.sample.elasticdemo.model.Employee;
import org.shan.sample.elasticdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("employeeService")
public class EmployeeServiceI implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceI(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
