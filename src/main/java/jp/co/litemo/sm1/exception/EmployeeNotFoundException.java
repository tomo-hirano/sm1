// jp/co/litemo/sm1/exception/EmployeeNotFoundException.java
package jp.co.litemo.sm1.exception;

/**
 * EmployeeNotFoundException.java
 * 従業員が見つからない場合の例外クラス
 * VBの例外処理をJava Springの例外に変換
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
