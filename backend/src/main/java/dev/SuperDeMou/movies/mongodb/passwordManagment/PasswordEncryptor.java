package dev.SuperDeMou.movies.mongodb.passwordManagment;

import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class PasswordEncryptor {
    private static final String CONFIG_FILE = "configuration.properties";
    private static final Properties properties = new Properties();

    static {
        try {
            InputStream inputStream = PasswordEncryptor.class.getClassLoader().getResourceAsStream(CONFIG_FILE);
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getEncryptionKey() {
        return properties.getProperty("encryption.key");
    }

    private static String getPassword() {
        return properties.getProperty("password");
    }

    private static String getCluster() {
        return properties.getProperty("cluster");
    }

    private static String encrypt(String password) throws Exception {
        SecretKey key = new SecretKeySpec(getEncryptionKey().getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedPassword) throws Exception {
        SecretKey key = new SecretKeySpec(getEncryptionKey().getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPassword));
        return new String(decryptedBytes);
    }

    public static String decryptCluster() {
        String decryptedCluster = "";
        String encryptedCluster = "";
        try {
            String cluster = getCluster();

            encryptedCluster = encrypt(cluster);
            decryptedCluster = decrypt(encryptedCluster);

        } catch (Exception e) {
            decryptedCluster = null;
            encryptedCluster = null;
            e.printStackTrace();
        }

        return decryptedCluster;
    }

    public static String decryptPassword() {
        String decryptedPassword = "";
        String encryptedPassword = "";
        try {
            String password = getPassword();

            encryptedPassword = encrypt(password);
            decryptedPassword = decrypt(encryptedPassword);

        } catch (Exception e) {
            decryptedPassword = null;
            encryptedPassword = null;
            e.printStackTrace();
        }

        return decryptedPassword;
    }
}
//"C:\Program Files\FireDaemon OpenSSL 3\bin\openssl.exe" pkcs12 -export -out keystore.pkcs12 -in "E:\Programation\All Java\Other projects\MovieCatalog\backend\src\main\java\dev\SuperDeMou\movies\mongodb\X509-cert-1969471392627108642.pem"
//"keytool -importkeystore -srckeystore keystore.pkcs12 -srcstoretype PKCS12 -destkeystore keystore.jks -deststoretype JKS"