package com.boutique.demo.repos;

import com.boutique.demo.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long>{
	
	Role  findByRole(String role);

	javax.management.relation.Role save(javax.management.relation.Role role);


}
