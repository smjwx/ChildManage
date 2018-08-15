package com.opo.ChildManage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Login;

@Mapper
public interface LoginMapper {

	@Select("select * from user "
			+ "where name = #{name} and password = #{password}")
	Login FindUserByNameAndPassword(
			@Param("name") String name, 
			@Param("password") String password);
	
}
