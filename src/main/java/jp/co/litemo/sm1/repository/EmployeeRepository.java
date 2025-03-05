// jp/co/litemo/sm1/repository/EmployeeRepository.java
package jp.co.litemo.sm1.repository;

import jp.co.litemo.sm1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * EmployeeRepository.java
 * 従業員リポジトリインターフェース
 * VBのIEmployeeRepositoryをJava Springのリポジトリに変換
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeNo(String employeeNo);
}
