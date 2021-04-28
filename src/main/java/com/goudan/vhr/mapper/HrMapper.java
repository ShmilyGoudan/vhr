package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Hr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HrMapper {
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
    int insert(Hr record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Hr record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Hr selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Hr record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);
}