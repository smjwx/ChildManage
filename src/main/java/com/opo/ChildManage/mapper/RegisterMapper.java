package com.opo.ChildManage.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Login;

@Mapper
public interface RegisterMapper {
	
	@Insert("insert into user(name,password,age,relation) "
			+ "values (#{name},#{password},#{age},#{relation})")
	void create(Login user);

	@Select("select * from user "
			+ "where name = #{name} and password = #{password}")
	Login FindUserByNameAndPassword(
			@Param("name") String name, 
			@Param("password") String password);
}
