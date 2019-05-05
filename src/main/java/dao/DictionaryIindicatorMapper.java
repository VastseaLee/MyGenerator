package dao;

import module.DictionaryIindicator;

public interface DictionaryIindicatorMapper {
    int deleteByPrimaryKey(String id);

    int insert(DictionaryIindicator record);

    int insertSelective(DictionaryIindicator record);

    DictionaryIindicator selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DictionaryIindicator record);

    int updateByPrimaryKey(DictionaryIindicator record);
}