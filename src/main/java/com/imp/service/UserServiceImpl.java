package com.imp.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.imp.model.Role;
import com.imp.model.User;
import com.imp.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void saveUser(User user) {
		user.setPassword(user.getPassword());
		userRepository.save(user);
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByName(userName);

		return null;
	}

	@Override
	public User findUserByBadge(Integer badge) {
		
		return null;
	}

}