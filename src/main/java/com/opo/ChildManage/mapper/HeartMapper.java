package com.opo.ChildManage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.opo.ChildManage.entity.HeartData;
import com.opo.ChildManage.entity.Msg;
import com.opo.ChildManage.entity.Show;

@Mapper
public interface HeartMapper {

	@Select("select user_id, time, heart from msg  where user_id = #{user_id} and heart is not null order by time desc")
    List<HeartData> findheart(int id);
}
