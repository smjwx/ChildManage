package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.User;

@Mapper
public interface ManageMapper {
	@Select("select * from user where relation=manage")
	
	List<User> find(String relation);

}
