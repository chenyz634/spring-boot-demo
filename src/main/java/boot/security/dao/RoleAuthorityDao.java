package boot.security.dao;

import boot.query.entity.RoleAuthority;
import boot.query.mapper.RoleAuthorityMapper;

import java.util.List;

public interface RoleAuthorityDao extends RoleAuthorityMapper {

    int insertRoleAuthorities(List<RoleAuthority> records);

}