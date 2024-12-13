//package com.ouss.gatewayservice.security;
//
///**
// * Project Name: project
// * File Name: tesst
// * Created by: DELL
// * Created on: 12/9/2024
// * Description:
// * <p>
// * tesst is a part of the project project.
// */
//
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
//@Configuration
//public class JwtDecoderConfig {
//
//    @Value("${JWT_URI_SET:http://localhost:8080/realms/ouss/protocol/openid-connect/certs}")
//    private String jwkSetUri;
//
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        // Log the JWK URI to verify
//        System.out.println("Initializing JwtDecoder with URI: " + jwkSetUri);
//        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
//    }
//}
