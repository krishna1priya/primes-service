package edu.iu.krishna1priya.primesservice.security;

import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.JWSAlgorithm;
import edu.iu.krishna1priya.primesservice.security.KeyGeneratorUtils;

import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.UUID;

public class Jwks {
    private Jwks() {}
    public static RSAKey generateRsa() {
        KeyPair keyPair = KeyGeneratorUtils.generateRsaKey();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        return new RSAKey.Builder(publicKey)
                .privateKey(privateKey)
                .keyID(UUID.randomUUID().toString())
                .build();
    }
}