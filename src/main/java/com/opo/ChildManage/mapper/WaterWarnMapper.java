package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Login;
import com.opo.ChildManage.entity.WaterWarn;

@Mapper
public interface WaterWarnMapper {

	@Insert("insert into msg(water_warn,user_id) values(#{water_warn},#{user_id})")
	void create(WaterWarn waterwarn) ;

	@Select("select user_id, time, water_warn from msg  where user_id = #{user_id} and water_warn is not null order by time desc")
	WaterWarn FindWaterWarn(
			@Param("user_id") int user_id);
}
