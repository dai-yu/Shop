package com.oracle.shop.model.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.oracle.shop.model.javabean.Users;
/**
 * 定一个userdao接口，用来给用户模块提供数据库操作的方法
 * @author Administrator
 *
 */

@Mapper
public interface UserDAO {
	/**
	 * 这是处理用户登录的dao方法
	 * @param username
	 * @param password
	 * @return
	 */
	@Select("select * from user where username=#{username} and password=#{password}")
	public Users login(@Param("username")String username, @Param("password")String password);

	@Insert("insert into user (username, password, Nicheng, question, answer) value (#{username}, #{password}, #{Nicheng}, #{question}, #{answer})")
	public int register(@Param("username")String username, @Param("password")String password, @Param("Nicheng")String Nicheng, @Param("question")String question, @Param("answer")String answer);
	
	@Select("select * from user where username=#{username} and question=#{question} and answer=#{answer}")
	public Users forget(@Param("username")String username, @Param("question")String question, @Param("answer")String answer);
	
	@Update("update user set password= #{password} where username=#{username}")
	public int update(@Param("username")String username, @Param("password")String password);
}
