package avto.repository;

import avto.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;


/**
 * Created by Adelya on 12.08.2018.
 */
public interface UserRepository {
    User getUserById(@Param("id")UUID id);
    void createUser(User user);
}
