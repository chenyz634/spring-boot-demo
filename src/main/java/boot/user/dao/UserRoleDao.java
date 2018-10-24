package boot.user.dao;

import boot.query.entity.UserRole;
import boot.query.mapper.UserRoleMapper;

import java.util.List;

public interface UserRoleDao extends UserRoleMapper {

    int insertUserRoles(List<UserRole> userRoles);

}