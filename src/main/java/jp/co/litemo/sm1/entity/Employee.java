// jp/co/litemo/sm1/entity/Employee.java
package jp.co.litemo.sm1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jp.co.litemo.sm1.util.ValidEmail;
import lombok.Getter;
import lombok.Setter;

/**
 * Employee.java
 * 従業員エンティティクラス
 * VBのEmployeeクラスをJava Springのエンティティに変換
 */
@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeNo;
    private String name;
    private String nameKana;
    @ValidEmail
    private String email;

    // Getters and Setters
}
