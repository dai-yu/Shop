package com.oracle.shop.model.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.oracle.shop.model.javabean.Users;

@Mapper
public interface UserDAO {
	
	@Select("select * from users where username=#{username} and password=#{password}")
	public Users login(@Param("username")String username, @Param("password")String password);
	
	@Insert("insert into users (username, password, Nicheng, question, answer) value (#{username}, #{password}, #{Nicheng}, #{question}, #{answer})")
	public int register(@Param("username")String username, @Param("password")String password, @Param("Nicheng")String Nicheng, @Param("question")String question, @Param("answer")String answer);
	
	@Select("select * from users where username=#{username} and question=#{question} and answer=#{answer}")
	public Users forget(@Param("username")String username, @Param("question")String question, @Param("answer")String answer);
	
	@Update("update users set password= #{password} where username=#{username}")
	public int update(@Param("username")String username, @Param("password")String password);
}
