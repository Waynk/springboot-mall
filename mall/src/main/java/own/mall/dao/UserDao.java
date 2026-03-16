package own.mall.dao;

import own.mall.dto.UserRegisterRequest;
import own.mall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);


}
