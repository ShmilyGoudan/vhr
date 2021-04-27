package com.goudan.vhr.mapper;

import com.goudan.vhr.model.Employeetrain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeetrainMapper {
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
    int insert(Employeetrain record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Employeetrain record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Employeetrain selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Employeetrain record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Employeetrain record);
}