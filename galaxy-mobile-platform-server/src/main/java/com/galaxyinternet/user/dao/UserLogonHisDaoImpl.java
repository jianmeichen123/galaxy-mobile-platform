package com.galaxyinternet.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.dao.logonHis.UserLogonHisDAO;
import com.galaxyinternet.framework.core.dao.impl.BaseDaoImpl;
import com.galaxyinternet.framework.core.exception.DaoException;
import com.galaxyinternet.model.logonHis.UserLogonHis;

@Repository(value="logonHisDao")
public class UserLogonHisDaoImpl extends BaseDaoImpl<UserLogonHis, Long> implements UserLogonHisDAO {

	@Override
	public int insertUserLogonHis(UserLogonHis userLogonHis) {
		Assert.notNull(userLogonHis);
		try {
			return sqlSessionTemplate.insert( "insertUserLogonHis" ,  userLogonHis);
		
		} catch (Exception e) {
			throw new DaoException(String.format("添加对象出错！语句：%s",  "insertUserLogonHis") ,  e);		
		}
	}

	@Override
	public int queryCountUserLogonHis(UserLogonHisBO userLogonHisbo) {
		// TODO Auto-generated method stub
		Assert.notNull(userLogonHisbo);
		try {
			return sqlSessionTemplate.selectOne("queryCount" , userLogonHisbo);
		
		} catch (Exception e) {
			throw new DaoException(String.format("查询对象出错！语句：%s","queryCount"), e);		
		}
	}//
	
	public UserLogonHis getUserLogonHisByParam(UserLogonHisBO userLogonHisbo) {
		// TODO Auto-generated method stub
		Assert.notNull(userLogonHisbo);
		try {
			return sqlSessionTemplate.selectOne("selectUserLogonHis" , userLogonHisbo);
		
		} catch (Exception e) {
			throw new DaoException(String.format("查询对象出错！语句：%s","select"), e);		
		}
	}
	
	public int  updateUserLogonHis(UserLogonHis userLogonHis) {
		Assert.notNull(userLogonHis);
		try {
			return sqlSessionTemplate.update( "updateUserLogonHis" ,  userLogonHis);
		
		} catch (Exception e) {
			throw new DaoException(String.format("更新对象出错！语句：%s",  "updateUserLogonHis") ,  e);		
		}
	}
	
	public int queryCountTodayLogon(UserLogonHisBO  userLogonHisBo){
		Integer result = 0 ;
		try {
			result =  sqlSessionTemplate.selectOne( "countTodayLogon" ,  userLogonHisBo);
		    System.out.println(result);
		} catch (Exception e) {
		e.printStackTrace();
			throw new DaoException(String.format("统计对象出错！语句：%s",  "countTodayLogon") ,  e);		
		}
		return result;
	}
	@Override
	public List<UserLogonHis> selectAllapp() {
		try {
			return sqlSessionTemplate.selectList("selectUserLogonHis");
		} catch (Exception e) {
			throw new DaoException(String.format("查询所有对象列表出错！语句：%s", getSqlName("selectUserLogonHis")), e);
		}
	}
	
	@Override
	public List<UserLogonHis> selectBiao() {
		try {
			return sqlSessionTemplate.selectList("selectbiao");
		} catch (Exception e) {
			throw new DaoException(String.format("查询所有对象列表出错！语句：%s", getSqlName("selectbiao")), e);
		}
	}
	
	
}
