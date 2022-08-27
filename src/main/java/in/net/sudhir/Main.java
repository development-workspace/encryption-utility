package in.net.sudhir;

/***
 Package Name: in.net.sudhir
 User Name: ${USER}
 Created Date: ${DATE} at ${TIME}
 Description:
 */
public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Invalid Arguments. Should contain only in the format <operation> <text> - e.g. ENCRYPT kjasfdkjdsfl & DECRYPT asdklfjasdlkfj");
            System.exit(1);
        }else{
            if(args[0].equalsIgnoreCase("ENCRYPT")){
                System.out.println("ENCRYPTED TEXT: " + EncryptionUtility.encryptData(args[1]));
            }else if(args[0].equalsIgnoreCase("DECRYPT")){
                System.out.println("DECRYPTED TEXT: " + EncryptionUtility.decryptData(args[1]));
            }else{
                System.out.println("Invalid Arguments. Should contain only 2 arguments in the format <operation> <text> - e.g. ENCRYPT kjasfdkjdsfl & DECRYPT asdklfjasdlkfj");
                System.exit(1);
            }
        }
    }
}