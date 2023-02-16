package com.example.jwtauthentication.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JWTService {
    private static final String SECRET_KEY="HELLO";  //We need to change it secret encryption keys
    public String extractUsername(String jwt) {



        return "";
    }
    private Claims extractAllClaims(String token){
        return Jwts.parserBuilder().setSigningKey(getSignKey()).
                build().parseClaimsJwt(token).getBody();
    }
    private Key getSignKey(){
        byte[] keybytes= Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keybytes);
    }
}
