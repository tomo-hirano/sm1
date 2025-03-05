// jp/co/litemo/sm1/util/ValidationUtil.java
package jp.co.litemo.sm1.util;

/**
 * ValidationUtil.java
 * 検証ユーティリティクラス
 * VBの検証ロジックをJava Springのユーティリティに変換
 */
public class ValidationUtil {

    public static boolean isValidEmail(String email) {
        return email != null && email.length() <= 30 && email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }
}
