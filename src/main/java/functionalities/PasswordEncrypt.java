/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

/**
 *
 * @author Azure
 */
import java.util.UUID;
import java.security.SecureRandom;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordEncrypt {
  private static final int ITERATIONS = 1000;
  private static final int KEY_LENGTH = 192; // bits


  public static String hashPassword(String password, String salt){
      
          char[] passwordChars = password.toCharArray();
          byte[] saltBytes = salt.getBytes();
          byte[] hashedPassword = null;
          
          PBEKeySpec spec = new PBEKeySpec(
                  passwordChars,
                  saltBytes,
                  ITERATIONS,
                  KEY_LENGTH
          );
          
       try {
          SecretKeyFactory key = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
          hashedPassword = key.generateSecret(spec).getEncoded();

      } catch (NoSuchAlgorithmException ex) {
          Logger.getLogger(PasswordEncrypt.class.getName()).log(Level.SEVERE, null, ex);
      } catch (InvalidKeySpecException ex) {
          Logger.getLogger(PasswordEncrypt.class.getName()).log(Level.SEVERE, null, ex);
      }
      return String.format("%x", new BigInteger(hashedPassword));
  }

  public static void main(String[] args) throws Exception{
    System.out.println(hashPassword("password", "salt"));
  }
}