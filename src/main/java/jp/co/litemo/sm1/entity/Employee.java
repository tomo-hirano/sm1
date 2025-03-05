// jp/co/litemo/sm1/entity/Employee.java
package jp.co.litemo.sm1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Employee.java
 * 従業員エンティティクラス
 * VBのEmployeeクラスをJava Springのエンティティに変換
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeNo;
    private String name;
    private String nameKana;
    private String email;

    // Getters and Setters
}
