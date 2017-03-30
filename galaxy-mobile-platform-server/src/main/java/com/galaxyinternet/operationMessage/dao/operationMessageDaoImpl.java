package com.galaxyinternet.operationMessage.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.galaxyinternet.bo.OperationMessageBo;
import com.galaxyinternet.dao.operationMessage.OperationMessageDao;
import com.galaxyinternet.framework.core.constants.SqlId;
import com.galaxyinternet.framework.core.dao.impl.BaseDaoImpl;
import com.galaxyinternet.framework.core.exception.DaoException;
import com.galaxyinternet.framework.core.model.Page;
import com.galaxyinternet.framework.core.utils.BeanUtils;
import com.galaxyinternet.model.operationMessage.OperationMessage;

@Repository("operationMessageDao")
public class operationMessageDaoImpl extends BaseDaoImpl<OperationMessage, Long> implements OperationMessageDao {

	@Override
	public List<String> selectProjecIdsByOperatorId(Long operator) {
		Assert.notNull(operator);
		try {
			return sqlSessionTemplate.selectList(getSqlName("selectProjecIdsByOperatorId"), operator);
		} catch (Exception e) {
			throw new DaoException(String.format("根据操作人查询项目id出错！语句：%s", getSqlName("selectProjecIdsByOperator")), e);
		}
	}

	//新增的获取消息列表
	@Override
	public Page<OperationMessage> selectListMessage(OperationMessageBo query, Pageable pageable) {
		try {
			long begin = System.currentTimeMillis();
			List<OperationMessage> contentList = sqlSessionTemplate.selectList(getSqlName("selectListMessage"),
			//List<OperationMessage> contentList = sqlSessionTemplate.selectList(getSqlName("selectTg"),
					getParams(query, pageable));
			//System.out.println("tdjamtam__1__" + (System.currentTimeMillis()-begin));
			return new  Page<OperationMessage>(contentList, pageable, this.selectCount(query));
		} catch (Exception e) {
			throw new DaoException(String.format("根据分页对象查询列表出错！语句:%s", getSqlName("selectListMessage")), e);
		}
	}
	@Override
	public List<OperationMessage> selectList(OperationMessageBo query) {
		try {
			Map<String, Object> params = BeanUtils.toMap(query);
			return sqlSessionTemplate.selectList(getSqlName("selectListMessage"), params);
		} catch (Exception e) {
			throw new DaoException(String.format("查询对象列表出错！语句：%s", getSqlName("selectListMessage")), e);
		}
	}
	
	
}