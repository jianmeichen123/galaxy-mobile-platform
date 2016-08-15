package com.galaxyinternet.bo;

import com.galaxyinternet.model.logonHis.UserLogonHis;

public class UserLogonHisBO extends UserLogonHis {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6707996180778618970L;
	
	private Integer todayPerson;

	//获取用户的登录总数
	private Long strCount;
	
	public Integer getTodayPerson() {
		return todayPerson;
	}

	
	public void setTodayPerson(Integer todayPerson) {
		this.todayPerson = todayPerson;
	}


	public Long getStrCount() {
		return strCount;
	}


	public void setStrCount(Long strCount) {
		this.strCount = strCount;
	}
	

	
 
}