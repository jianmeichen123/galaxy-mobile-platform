package com.galaxyinternet.dao.logonHis;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.framework.core.dao.BaseDao;
import com.galaxyinternet.model.logonHis.UserLogonHis;

public interface UserLogonHisDAO  extends BaseDao<UserLogonHis, Long>{
	
	public int insertUserLogonHis(UserLogonHis userLogonHis);

	public int queryCountUserLogonHis(UserLogonHisBO userLogonHisbo);
	
	public UserLogonHis getUserLogonHisByParam(UserLogonHisBO userLogonHisbo) ;
	
	public int  updateUserLogonHis(UserLogonHis userLogonHis) ;
	
	public int queryCountTodayLogon(UserLogonHisBO  userLogonHis);
}
