package com.simoncomputing.app.helloworld.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.simoncomputing.app.helloworld.domain.Phone;

public interface UserPhoneDAO {
    
    @Insert(" INSERT INTO user_phone( user_id, type, number ) " 
            + " VALUES( #{uid}, #{phone.type}, #{phone.number} ) ")
    @SelectKey(statement="call identity()", keyProperty="id", before=false, resultType=Integer.class)
    void insertPhone(@Param("uid") Integer userId, @Param("phone")Phone phone);
    
//    @Select(" SELECT * FROM user_phone WHERE user_id = #{uid}")
//    @Results(id = "userResults")
    List<Phone> getPhonesByUserId(@Param("uid") Integer userId);
    
//    @Delete(" DELETE FROM user_phone WHERE user_id = #{uid}")
    void deletePhones(Integer userId);
}
