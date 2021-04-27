package com.goudan.vhr.mapper;

import com.goudan.vhr.model.MenuRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuRoleMapper {
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
    int insert(MenuRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(MenuRole record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    MenuRole selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(MenuRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(MenuRole record);
}