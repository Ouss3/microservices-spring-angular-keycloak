//package com.ouss.gatewayservice.security;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled  = true)
//public class SecurityConfigGatway {
//
//
//    @Value("${JWT_URI_SET:http://localhost:8080/realms/ouss/protocol/openid-connect/certs}")
//    private String jwkSetUri;
//    private JwtAuthConverterGateway jwtAuthConverterGateway;
////    JwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
//
//
//    public SecurityConfigGatway(JwtAuthConverterGateway jwtAuthConverterGateway) {
//
//        this.jwtAuthConverterGateway = jwtAuthConverterGateway;
//    }
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain2(HttpSecurity httpSecurity) throws Exception{
//
//        return httpSecurity.
//        cors(Customizer.withDefaults())
//        .sessionManagement(
//                sm->sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).
//                csrf(csrf->csrf.disable())
//               //.authorizeHttpRequests(ar->ar.requestMatchers("/api/clients/**").hasAuthority("USER"))
//                .authorizeHttpRequests(ar->ar.anyRequest().authenticated())
//                .oauth2ResourceServer(oauth -> oauth.jwt(jwt -> {
//            // Set both the JwtDecoder and the JwtAuthenticationConverter
//            jwt.decoder(reactiveJwtDecoder());  // Use the JwtDecoder you defined
//            jwt.jwtAuthenticationConverter(jwtAuthConverterGateway);  // Your custom converter
//        }))
//
//                .build() ;
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource2() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("*"));
//        configuration.setAllowedMethods(Arrays.asList("*"));
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        configuration.setExposedHeaders(Arrays.asList("*"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//}
