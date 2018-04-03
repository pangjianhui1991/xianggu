package com.pangjh.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.pangjh.model.User;

public interface UserService {
	
	@Cacheable(value="users", key="'user_'+#id")
	User getUser(String id);
	
	@CacheEvict(value="users", key="'user_'+#id",condition="#id!=1")
	void deleteUser(String id);

}
