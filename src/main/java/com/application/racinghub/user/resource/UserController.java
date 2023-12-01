package com.application.racinghub.user.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.racinghub.common.resource.BaseController;
import com.application.racinghub.user.domain.UserService;
import com.application.racinghub.user.domain.model.User;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User> {
	
	protected UserController(final UserService service) {
		super(service);
	}
	
}
