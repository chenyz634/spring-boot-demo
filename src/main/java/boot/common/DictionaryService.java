package boot.common;

import boot.application.query.Paging;
import boot.common.vo.DictionaryNode;
import boot.common.vo.FindDictionaryParam;
import boot.query.entity.Dictionary;

import java.util.List;

/**
 * 数据字典服务接口。
 **/
public interface DictionaryService {

    Paging<Dictionary> findWithSubDictionary(FindDictionaryParam findDictionaryParam);

    void addDictionary(Dictionary dictionary);

    void updateDictionary(Dictionary dictionary);

    void deleteDictionary(Long dictionaryId);

    List<DictionaryNode> findDictionaryTrees(String[] rootValues);
}
