package com.application.racinghub.user.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.application.racinghub.common.domain.BaseServiceImpl;
import com.application.racinghub.user.domain.model.User;
import com.application.racinghub.user.infra.UserRepository;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	public UserServiceImpl() {
        super(User.class);
    }
	
	@Autowired
	private UserRepository repository;

	@Override
	protected JpaRepository<User, Long> getRepository() {
		return repository;
	}

}
