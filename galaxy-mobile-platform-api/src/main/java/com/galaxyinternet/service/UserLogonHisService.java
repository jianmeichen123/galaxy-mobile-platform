package com.galaxyinternet.service;

import java.util.List;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.framework.core.service.BaseService;
import com.galaxyinternet.model.logonHis.UserLogonHis;

public interface UserLogonHisService extends BaseService<UserLogonHis>{
	
	
	public void saveLogonHis(UserLogonHis  logonEntity)throws Exception;
	
	public UserLogonHis queryUserLogon(UserLogonHisBO logonBo)throws Exception;
		
	public Integer updateUserLogon(UserLogonHis  logonEntity)throws Exception;
	
	public Integer queryCountTodayLogon(UserLogonHisBO  UserLogonHisbo)throws Exception;
	
	public List<UserLogonHis> selectAllapp();
	
	//app端需要展示用户登录的最后时间和登录的次数
	public List<UserLogonHis> selectBiao();

}
