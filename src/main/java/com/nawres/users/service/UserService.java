package com.nawres.users.service;
import com.nawres.users.entities.Role;
import com.nawres.users.entities.User;
public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	 

}
