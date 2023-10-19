package com.example.pp315_js.util;


import com.example.pp315_js.model.Role;
import com.example.pp315_js.model.User;
import com.example.pp315_js.service.RoleService;
import com.example.pp315_js.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;

@Component
public class CreateUserDefault {

    private UserService userService;
    private RoleService roleService;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public CreateUserDefault(UserService userService, RoleService roleService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
    }


    @Bean
    public void createDef() {

        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");

        roleService.save(adminRole);
        roleService.save(userRole);

        Set<Role> adminSet = new HashSet<>();
        adminSet.add(adminRole);
        adminSet.add(userRole);
        Set<Role> userSet = new HashSet<>();
        userSet.add(userRole);

        User user = new User("user", "def", 11, "user@user.com", "user", userSet);
        User admin = new User("admin", "def", 99, "admin@admin.com", "admin", adminSet);
        userService.saveUser(user);
        userService.saveUser(admin);

    }
}

