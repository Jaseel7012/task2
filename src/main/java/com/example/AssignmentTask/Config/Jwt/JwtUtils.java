package com.example.AssignmentTask.Config.Jwt;

import com.example.AssignmentTask.Config.Service.UserDetailsImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {
    @Value("${bezkoder.app.jwtSecret}")
    private String jwtSecret;

    @Value("${bezkoder.app.jwtExpirationMs}")
    private int jwtExpiry;

    public String generateJwtToken(Authentication authentication){
        UserDetailsImp userDetailsImp=new UserDetailsImp()
    }
}
