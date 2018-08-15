package com.opo.ChildManage.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opo.ChildManage.entity.BloodData;
import com.opo.ChildManage.entity.HeartData;
import com.opo.ChildManage.entity.Info;
import com.opo.ChildManage.entity.Login;
import com.opo.ChildManage.entity.Msg;
import com.opo.ChildManage.entity.Show;
import com.opo.ChildManage.entity.SleepData;
import com.opo.ChildManage.entity.SleepWarn;
import com.opo.ChildManage.entity.User;
import com.opo.ChildManage.entity.WaterSum;
import com.opo.ChildManage.entity.WaterWarn;
import com.opo.ChildManage.service.AppService;

@RestController
@RequestMapping
public class AppController {

	@Autowired
	public AppService service;

	@GetMapping("/login")
	public Login log(String name, String password) {
		System.out.println("login: " + name);
		return service.login(name, password);
	}

	@GetMapping("/register")
	public Info reg(User u) {
//		public Info reg(@RequestBody User u) {
		return service.register(u);

	}

	@GetMapping("/waterwarn")
	public Info ww(WaterWarn w) {
		System.out.println(w);
		return service.water_warn(w);
		
	}
	
	@GetMapping("/sleepwarn")
	public Info sw(SleepWarn s) {
		return service.sleep_warn(s);
		
	}
	
	@GetMapping("/home/{id}")
	public List<Msg> index(@PathVariable int id) {
		return service.loadMsg(id);
	}
	
	@GetMapping("/manage")
	public List<User> mng(String relation){
		return  service.manage(relation);
	}
	
	@GetMapping("/water/{id}")
	public WaterSum wbu(@PathVariable int id){
		return service.getWaterByUser(id);
		
	}
	
	
//	@GetMapping("/chart/{id}")
//	public ChartData chart(@PathVariable int id) {
//		return service.getChartData(id);
//	}
	
	@GetMapping("/heart/{id}")
	public List<HeartData> heart(@PathVariable int id) {
		return service.getHeart(id);
		
	}
	
	@GetMapping("/blood/{id}")
	public List<BloodData> blood(@PathVariable int id) {
		return service.getBlood(id);
		
	}
	
	@GetMapping("/sleep/{id}")
	public List<SleepData> sleep(@PathVariable int id) {
		return service.getSleep_t(id);
		
	}
	
	
}
