package com.example.pp315_js.dao;

import com.example.pp315_js.model.Role;
import com.example.pp315_js.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleDAOImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllUsers() {
        return roleRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteById(Integer id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role showUserById(Integer id) {
        return roleRepository.getOne(id);
    }
}

