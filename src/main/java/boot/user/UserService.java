package boot.user;

import boot.application.query.Paging;
import boot.query.entity.User;
import boot.user.vo.FindUserParam;
import boot.user.vo.UserWithRole;

/**
 * 用户服务接口。
 **/
public interface UserService {

    User getUser(Long userId);

    Long addUserWithRole(UserWithRole userWithRole);

    long updateUserWithRole(UserWithRole userWithRole);

    Paging<UserWithRole> findUserWithRole(FindUserParam findUserParam);

    long deleteUser(Long userId);

}
