package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Msg;
import com.opo.ChildManage.entity.WaterSum;

@Mapper
public interface MsgMapper {

	@Select("select * from msg where user_id = #{user_id}")
	List<Msg> find(int id);
	
	@Select("select * from user_water where user_id = #{user_id} order by time desc limit 1")
	WaterSum findSumWater(int id);

}
