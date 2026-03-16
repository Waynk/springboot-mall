package own.mall.service;

import own.mall.dto.UserLoginRequest;
import own.mall.dto.UserRegisterRequest;
import own.mall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
