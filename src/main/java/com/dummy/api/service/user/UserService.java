package com.dummy.api.service.user;

import com.dummy.api.service.user.request.UserRequest;
import com.dummy.api.service.user.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Transactional
    public UserResponse createUser(UserRequest request){
        return null;
    }
}
