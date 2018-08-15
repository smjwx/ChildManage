package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Login;
import com.opo.ChildManage.entity.Msg;

@Mapper
public interface HomePageMapper {

	@Select("select name from user where name = #{name}")
	Login FindUserByNameAndPassword(
			@Param("name") String name);
	
	@Select("select * from msg")
	List<Msg> find();
}
