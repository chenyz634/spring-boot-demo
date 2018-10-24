package boot.security;

import boot.application.query.Paging;
import boot.query.entity.Authority;
import boot.query.entity.Role;
import boot.security.vo.AuthorityNode;
import boot.security.vo.FindRoleParam;
import boot.security.vo.RoleWithAuthority;

import java.util.List;

/**
 * 安全服务接口。
 **/
public interface SecurityService {

    SecurityUser getSecurityUser(String username);

    List<Authority> getAllAuthority();

    void addAuthority(Authority authority);

    void updateAuthority(Authority authority);

    void deleteAuthority(Long authorityId);

    List<AuthorityNode> getAuthorityTree();

    List<AuthorityNode> getUserAuthorities(Long userId);

    List<Role> getAllRoles();

    Paging<RoleWithAuthority> findRoleWithAuthority(FindRoleParam findRoleParam);

    void addRoleWithAuthority(RoleWithAuthority roleWithAuthority);

    void updateRoleWithAuthority(RoleWithAuthority roleWithAuthority);

    void deleteRole(Long roleId);

    boolean userHasPermission(Long userId, String action, String targetType, String targetId);
}
