public class Decoder {
    public static void main(String[] args) {
        /**

         Program description: Decoder

         Author: Gülfem Küpeli

         E-mail address: 210401024@ogr.ikcu.edu.tr

         Homework Number: 03

         Last Changed: 10/11/2023

         */
        String encrypted = ":mmZ\\dxZmx]Zpgy";

        for (int key = 1; key <= 100; key++) {
            String decrypted = decrypt(encrypted, key);
            System.out.println("Key: " + key + ": " + decrypted);
        }
    }
/*
 The decrypt method takes encrypted and a key ;
 returns the decrypted message.
*/
public static String decrypt(String encrypted, int key) {
        StringBuilder decrypted = new StringBuilder();
        /*
        The if condition checks if the result of encryptedMes- key is less then 32.
         If true, it adjusts the decryption.
         If the result isn't less than 32, it subtracts the key from the ASCII value.
        */
        for (int i = 0; i < encrypted.length(); i++) {
            char encryptedMes = encrypted.charAt(i);
            char decryptedMes;

            if ((encryptedMes -key)<32 ) {
                    decryptedMes = (char) (127- (32 - (encryptedMes- key)));
            } else {
                decryptedMes = (char) (encryptedMes - key);
            }
            decrypted.append(decryptedMes);
        }
        return decrypted.toString();
    }
}
