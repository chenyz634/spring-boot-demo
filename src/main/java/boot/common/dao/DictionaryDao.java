package boot.common.dao;

import boot.common.vo.DictionaryNode;
import boot.common.vo.FindDictionaryParam;
import boot.query.entity.Dictionary;
import boot.query.mapper.DictionaryMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryDao extends DictionaryMapper {

    long countDictionary(FindDictionaryParam findDictionaryParam);

    List<Dictionary> findWithSubDictionary(FindDictionaryParam findDictionaryParam);

    long countSames(@Param("dictionaryId") Long dictionaryId, @Param("parentId") Long parentId,
                    @Param("name") String name, @Param("value") String value);

    List<DictionaryNode> findRootSubDictionaries(String[] rootValues);
}