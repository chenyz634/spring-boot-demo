package boot.user.dao;

import boot.query.mapper.UserMapper;
import boot.user.vo.FindUserParam;
import boot.user.vo.UserWithRole;

import java.util.List;

public interface UserDao extends UserMapper {

    long countUser(FindUserParam findUserParam);

    List<UserWithRole> findUserWithRole(FindUserParam findUserParam);

}