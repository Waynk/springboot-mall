package own.mall.dao;

import own.mall.dto.UserRegisterRequest;
import own.mall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);


}
