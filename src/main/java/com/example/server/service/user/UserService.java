package com.example.server.service.user;

import com.example.server.dto.UserDto;
import com.example.server.model.User;

public interface UserService {
	
	User findByUsername(String username);
	User save (UserDto userDto);

}
