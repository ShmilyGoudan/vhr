package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Adjustsalary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdjustsalaryMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Adjustsalary record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Adjustsalary record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Adjustsalary selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Adjustsalary record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Adjustsalary record);
}