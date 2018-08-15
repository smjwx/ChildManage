package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.Show;

@Mapper
public interface ShowMapper {
	@Select("select user_id,time, sleep_t from msg  where user_id = #{user_id} and sleep_t is not null  order by time desc ")
	List<Show> findsleep(int user_id);
	
	@Select("select user_id, time, bed_t from msg  where user_id = #{user_id} and bed_t is not null  order by time desc")
	List<Show> findbed(int user_id);
	
	@Select("select user_id, time, blood from msg  where user_id = #{user_id} and blood is not null order by time desc ")
	List<Show> findblood(int user_id);
	
	@Select("select user_id, time, heart from msg  where user_id = #{user_id} and heart is not null  order by time desc ")
	List<Show> findheart(int user_id);
	
}
