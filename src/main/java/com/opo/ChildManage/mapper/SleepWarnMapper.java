package com.opo.ChildManage.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.SleepWarn;
import com.opo.ChildManage.entity.WaterWarn;

@Mapper
public interface SleepWarnMapper {

	@Insert("insert into msg(user_id,sleep_warn) values(#{user_id},#{sleep_warn})")
	void create(SleepWarn sleepwarn) ;

	@Select("select user_id, time, sleep_warn from msg  where user_id = #{user_id} and sleep_warn is not null order by time desc")
	SleepWarn FindSleepWarn(
			@Param("user_id")int user_id);
	
}
