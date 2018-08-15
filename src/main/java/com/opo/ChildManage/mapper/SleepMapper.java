package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.BloodData;
import com.opo.ChildManage.entity.SleepData;

@Mapper
public interface SleepMapper {

	@Select("select user_id, time, sleep_t from msg  where user_id = #{user_id} and sleep_t is not null order by time desc")

	List<SleepData> findsleep(int id);
}
