package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Politicsstatus;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PoliticsstatusMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Politicsstatus record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Politicsstatus record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Politicsstatus selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Politicsstatus record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Politicsstatus record);
}