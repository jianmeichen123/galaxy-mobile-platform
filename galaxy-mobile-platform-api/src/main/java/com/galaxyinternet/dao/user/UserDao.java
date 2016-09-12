package com.galaxyinternet.dao.user;

import java.util.List;
import java.util.Map;

import com.galaxyinternet.framework.core.dao.BaseDao;
import com.galaxyinternet.model.user.User;

public interface UserDao extends BaseDao<User, Long> {
	
	User selectByNickName(User user);
	User selectByEmail(User user);
	User selectByRealName(String realName);
	public List<User> selectListById(List<String> idList);
	//新增的方法app端推送
	List<User> selectUserByParams(Map<String, Object> params);
	
}
