package org.shan.sample.elasticdemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shan.sample.elasticdemo.ElasticdemoApplication;
import org.shan.sample.elasticdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticdemoApplication.class)
public class EmployeeServiceITest {

    @Autowired
    @Qualifier("employeeService")
    private EmployeeServiceI employeeService;

    @Test
    public void save() {
        Employee employee=new Employee();
        employee.setEmpId("1001");
        employee.setEmpName("Shankhadeep");
        employeeService.save(employee);
        System.out.println("Employee saved");
    }
}