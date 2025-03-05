// jp/co/litemo/sm1/controller/EmployeeController.java
package jp.co.litemo.sm1.controller;

import jp.co.litemo.sm1.entity.Employee;
import jp.co.litemo.sm1.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * EmployeeController.java
 * 従業員コントローラークラス
 * VBのUIロジックをJava Springのコントローラーに変換
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
