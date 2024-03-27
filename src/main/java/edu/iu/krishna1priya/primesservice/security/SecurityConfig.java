package edu.iu.krishna1priya.primesservice.security;
import com.nimbusds.jose.jwk.RSAKey;
import org.springframework.stereotype.Component;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Component
public class KeyGeneratorUtils {
    private KeyGeneratorUtils() {}

        public static KeyPair generateRsaKey() {
            try {
                KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
                keyGenerator.initialize(2048, new SecureRandom());
                return keyGenerator.generateKeyPair();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Failed to generate RSA key pair", e);
            }
        }
    }