package com.goudan.vhr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @Program vhr
 * @Author Goudan
 * @Date 2021/4/28 11:59
 * @Description
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerResponse {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;


    public static ServerResponse builder(Integer status, String msg, Object Date) {
        return new  ServerResponse();
    }


    public static ServerResponse success(){
        return new ServerResponse(200,null, null);
    }
    public static ServerResponse success(String msg){
        return new ServerResponse(200,msg, null);
    }
    public static ServerResponse success(Object data){
        return new ServerResponse(200,null, data);
    }
    public static ServerResponse success(String msg,Object data){
        return new ServerResponse(200,msg, data);
    }




    public static ServerResponse error(){
        return new ServerResponse(500,null, null);
    }
    public static ServerResponse error(String msg){
        return new ServerResponse(500,msg, null);
    }
    public static ServerResponse error(Object data){
        return new ServerResponse(500,null, data);
    }
    public static ServerResponse error(String msg,Object data){
        return new ServerResponse(500,msg, data);
    }





}
