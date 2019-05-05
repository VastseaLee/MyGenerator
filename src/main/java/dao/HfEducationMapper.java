package dao;

import module.HfEducation;
import module.HfEducationWithBLOBs;

public interface HfEducationMapper {
    int deleteByPrimaryKey(String id);

    int insert(HfEducationWithBLOBs record);

    int insertSelective(HfEducationWithBLOBs record);

    HfEducationWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HfEducationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HfEducationWithBLOBs record);

    int updateByPrimaryKey(HfEducation record);
}