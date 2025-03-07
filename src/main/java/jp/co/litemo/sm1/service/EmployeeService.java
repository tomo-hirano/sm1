// jp/co/litemo/sm1/service/EmployeeService.java
package jp.co.litemo.sm1.service;

import jp.co.litemo.sm1.entity.Employee;
import jp.co.litemo.sm1.repository.EmployeeRepository;
import jp.co.litemo.sm1.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.validation.Valid;

import java.util.List;

/**
 * EmployeeService.java
 * 従業員サービスクラス
 * VBのビジネスロジックをJava Springのサービスに変換
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public Employee saveEmployee(@Valid Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
