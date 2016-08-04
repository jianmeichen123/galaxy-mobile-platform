package com.galaxyinternet.dao.logonHis;

import java.util.List;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.framework.core.dao.BaseDao;
import com.galaxyinternet.model.logonHis.UserLogonHis;

public interface UserLogonHisDAO  extends BaseDao<UserLogonHis, Long>{
	
	public int insertUserLogonHis(UserLogonHis userLogonHis);

	public int queryCountUserLogonHis(UserLogonHisBO userLogonHisbo);
	
	public UserLogonHis getUserLogonHisByParam(UserLogonHisBO userLogonHisbo) ;
	
	public int  updateUserLogonHis(UserLogonHis userLogonHis) ;
	
	public int queryCountTodayLogon(UserLogonHisBO  userLogonHis);
	
	public List<UserLogonHis> selectAllapp();
	//app端需要展示用户登录的最后时间和登录的次数
	public List<UserLogonHis> selectBiao();
}
