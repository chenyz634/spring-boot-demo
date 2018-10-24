package boot.security.dao;

import boot.query.mapper.RoleMapper;
import boot.security.vo.FindRoleParam;
import boot.security.vo.RoleWithAuthority;

import java.util.List;

public interface RoleDao extends RoleMapper {

    long countRole(FindRoleParam findRoleParam);

    List<RoleWithAuthority> findRoleWithAuthority(FindRoleParam findRoleParam);

}