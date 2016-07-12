package com.galaxyinternet.service;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.framework.core.service.BaseService;
import com.galaxyinternet.model.logonHis.UserLogonHis;

public interface UserLogonHisService extends BaseService<UserLogonHis>{
	
	
	public void saveLogonHis(UserLogonHis  logonEntity)throws Exception;
	
	public UserLogonHis queryUserLogon(UserLogonHisBO logonBo)throws Exception;
		
	public Integer updateUserLogon(UserLogonHis  logonEntity)throws Exception;
	
	public Integer queryCountTodayLogon(UserLogonHisBO  UserLogonHisbo)throws Exception;
	

}
