package br.com.schumaker.core;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import br.com.schumaker.util.HsCommons;

/**
 *
 * @author hudson schumaker HStudio - @BomRango 13/01/2015
 * @version 1.0.0
 * @since 1.0.0
 */
public class HsEncryption {

    public static String encrypt(String text) {
        String value = null;
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(HsCommons.ENCRYPTKEY);
            SecretKey chave = kgen.generateKey();
            Cipher cipher = Cipher.getInstance(HsCommons.ENCRYPTKEY);
            cipher.init(Cipher.ENCRYPT_MODE, chave);
            byte criptografada[] = cipher.doFinal(text.getBytes());
            value = new String(criptografada);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.toString());
        } catch (NoSuchPaddingException e) {
            System.err.println(e.toString());
        } catch (InvalidKeyException e) {
            System.err.println(e.toString());
        } catch (IllegalBlockSizeException e) {
            System.err.println(e.toString());
        } catch (BadPaddingException e) {
            System.err.println(e.toString());
        }
        return value;
    }
}
