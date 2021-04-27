package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Employeeec;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeecMapper {
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
    int insert(Employeeec record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Employeeec record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Employeeec selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Employeeec record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Employeeec record);
}