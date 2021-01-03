package com.selldok.toy.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Incheol Jung
 */
@Getter
@Setter
public class SelldokUserToken extends UsernamePasswordAuthenticationToken {

    private Long id;
    private String accessToken;
    private String name;
    private String email;
    private String phoneNumber;
    private String picUrl;

    public SelldokUserToken(Long id, String accessToken, String name, String email, String phoneNumber, String picUrl, ROLE role){
        super(name, email, List.of(new SimpleGrantedAuthority(role)));
        this.id = id;
        this.accessToken = accessToken;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.picUrl = picUrl;
    }
}
