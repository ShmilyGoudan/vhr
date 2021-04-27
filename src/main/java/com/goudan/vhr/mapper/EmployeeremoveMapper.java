package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Employeeremove;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeremoveMapper {
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
    int insert(Employeeremove record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Employeeremove record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Employeeremove selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Employeeremove record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Employeeremove record);
}