package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Joblevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoblevelMapper {
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
    int insert(Joblevel record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Joblevel record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Joblevel selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Joblevel record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Joblevel record);
}