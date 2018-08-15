package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.BloodData;

@Mapper
public interface BloodMapper {

	@Select("select user_id, time, blood from msg  where user_id = #{user_id} and blood is not null order by time desc")
	List<BloodData> findblood(int id);
}
