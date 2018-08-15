package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.User;

@Mapper
public interface UserMapper {

	@Insert("insert into user(name,password,age,relation) " + "values (#{name},#{password},#{age},#{relation})")
	void create(User user);

	@Select("select * from user where name = #{name}")
	User findUserByName(@Param("name") String name);

	@Select("select id,name from user")
	List<User> find(String relation);
}
