package in.net.sudhir;

import org.jasypt.util.text.BasicTextEncryptor;

/***
 Package Name: in.net.sudhir
 User Name: SUDHIR
 Created Date: 26-08-2022 at 18:04
 Description:
 */
public class EncryptionUtility {

    public static final String ENCRYPTION_CODE = System.getenv("ENCRYPTION_CODE");

    public static String encryptData(String inputText){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(ENCRYPTION_CODE);
        return textEncryptor.encrypt(inputText);
    }

    public static String decryptData(String inputText){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(ENCRYPTION_CODE);
        return textEncryptor.decrypt(inputText);
    }
}
