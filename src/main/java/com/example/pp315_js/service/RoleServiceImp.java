package com.example.pp315_js.service;

import com.example.pp315_js.dao.RoleDAO;
import com.example.pp315_js.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class RoleServiceImp implements RoleService {

    private final RoleDAO roleDAO;

    @Autowired
    public RoleServiceImp(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> getAllUsers() {
        return roleDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleDAO.save(role);
    }

    @Override
    public void deleteById(Integer id) {
        roleDAO.deleteById(id);
    }

    @Override
    public Role showUserById(Integer id) {
        return roleDAO.showUserById(id);
    }
}
