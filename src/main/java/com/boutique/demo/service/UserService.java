package com.boutique.demo.service;

import com.boutique.demo.entities.Role;
import com.boutique.demo.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
