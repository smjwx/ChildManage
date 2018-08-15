package com.opo.ChildManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opo.ChildManage.entity.BloodData;
import com.opo.ChildManage.entity.HeartData;
import com.opo.ChildManage.entity.HomePage;
import com.opo.ChildManage.entity.Info;
import com.opo.ChildManage.entity.Login;
import com.opo.ChildManage.entity.Msg;
import com.opo.ChildManage.entity.Show;
import com.opo.ChildManage.entity.SleepData;
import com.opo.ChildManage.entity.SleepWarn;
import com.opo.ChildManage.entity.User;
import com.opo.ChildManage.entity.WaterSum;
import com.opo.ChildManage.entity.WaterWarn;
import com.opo.ChildManage.mapper.BloodMapper;
import com.opo.ChildManage.mapper.HeartMapper;
import com.opo.ChildManage.mapper.HomePageMapper;
import com.opo.ChildManage.mapper.ManageMapper;
import com.opo.ChildManage.mapper.MsgMapper;
import com.opo.ChildManage.mapper.ShowMapper;
import com.opo.ChildManage.mapper.SleepMapper;
import com.opo.ChildManage.mapper.SleepWarnMapper;
import com.opo.ChildManage.mapper.UserMapper;
import com.opo.ChildManage.mapper.WaterWarnMapper;

@Service
public class AppService {
	
	@Autowired
	UserMapper userMapper;

	@Autowired
	MsgMapper msgMapper;

	@Autowired
	HomePageMapper homepagemapper;
	
	@Autowired
	ManageMapper managemapper;
	
	@Autowired
	ShowMapper showmapper;
	
	@Autowired
	HeartMapper heartmapper;

	@Autowired
	BloodMapper bloodmapper;
	
	@Autowired
	SleepMapper sleepmapper;
	
	@Autowired
	WaterWarnMapper waterwarnmapper;
	
	@Autowired
	SleepWarnMapper sleepwarnmapper;
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public Login login(String name,String password) {
		User u = userMapper.findUserByName(name);

		Login log = new Login();
		
		if (null == u) {
			// 用户不存在
			log.setInfoCode(3);
			log.setInfoText("用户不存在");
			log.setName(name);
		} else if (!u.getPassword().equals(password)) {
			// 密码不匹配
			log.setInfoCode(2);
			log.setInfoText("密码不匹配");
			log.setName(name);
		} else {
			// 成功
			log.setInfoCode(1);
			log.setInfoText("登录成功");
			log.setName(name);
			log.setId(u.getId());
			log.setRelation(u.getRelation());
			log.setAge(u.getAge());
		}

		return log;
	}

	/**
	 * 
	 * @param u
	 * @return
	 */
	public Info register(User u) {
		userMapper.create(u);
		Info info = new Info();
		return info;
	}
	
	public Info water_warn(WaterWarn w) {
		waterwarnmapper.create(w);
		Info info = new Info();
		return info;
		
	}
	
	public Info sleep_warn(SleepWarn s) {
		sleepwarnmapper.create(s);
		Info info = new Info();
		return info;
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Msg> loadMsg(int user_id) {
		return msgMapper.find(user_id);
	}

	/**
	 * 
	 * @param relation
	 * @return
	 */
	public List<User> manage(String relation) {		
		return userMapper.find(relation);
	}
	
	public WaterSum getWaterByUser(int user_id){
		return msgMapper.findSumWater(user_id);
	}

	
//	public ChartData getChartData(int user_id) {
//		ChartData data = new ChartData();
//		
//		data.setWater(msgMapper.findSumWater(user_id));
//		data.setBed_t(showmapper.findbed(user_id));
//		data.setSleep_t(showmapper.findsleep(user_id));
//		data.setBlood(showmapper.findblood(user_id));
//		data.setHeart(showmapper.findheart(user_id));
//		
//		return data;
//	}
//	
	public List<HeartData> getHeart(int id) {
		return heartmapper.findheart(id) ;
		
	}


	public List<BloodData> getBlood(int id) {
		return bloodmapper.findblood(id) ;
		
	}
	
	public List<SleepData> getSleep_t(int id) {
		return sleepmapper.findsleep(id) ;
		
	}
	
	
}
