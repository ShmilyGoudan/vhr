package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Empsalary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpsalaryMapper {
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
    int insert(Empsalary record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Empsalary record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Empsalary selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Empsalary record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Empsalary record);
}