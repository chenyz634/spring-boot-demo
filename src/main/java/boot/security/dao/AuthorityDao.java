package boot.security.dao;

import boot.query.mapper.AuthorityMapper;
import boot.security.vo.AuthorityNode;

import java.util.List;

public interface AuthorityDao extends AuthorityMapper {

    List<AuthorityNode> getUserAuthorities(Long userId);

    List<AuthorityNode> getAuthorityNodes();

}