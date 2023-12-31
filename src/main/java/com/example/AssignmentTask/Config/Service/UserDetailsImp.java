package com.example.AssignmentTask.Config.Service;

import com.example.AssignmentTask.Models.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserDetailsImp implements UserDetails {
    private Long id;
    private String name;
    private String userName;
    private String password;

    private String contact;

    private Collection<? extends GrantedAuthority> authorities;

    public static UserDetailsImp build(User user){
        List<GrantedAuthority> authorities=user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());
return new UserDetailsImp(user.getId(),user.getName(),user.getEmail(),user.getContact(),user.getPassword(),authorities);

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
