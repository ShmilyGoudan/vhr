package com.goudan.vhr.mapper;

import com.goudan.vhr.model.MailSendLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MailSendLogMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(MailSendLog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(MailSendLog record);
}