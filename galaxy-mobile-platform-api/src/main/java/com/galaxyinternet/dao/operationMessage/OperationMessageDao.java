package com.galaxyinternet.dao.operationMessage;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.galaxyinternet.bo.OperationMessageBo;
import com.galaxyinternet.framework.core.dao.BaseDao;
import com.galaxyinternet.framework.core.model.Page;
import com.galaxyinternet.model.operationMessage.OperationMessage;

public interface OperationMessageDao extends BaseDao<OperationMessage, Long>{

	
	List<String> selectProjecIdsByOperatorId(Long operator);
	//新增的消息列表
	Page<OperationMessage> selectListMessage(OperationMessageBo query, Pageable pageable);
	
	//消息列表
	List<OperationMessage> selectList(OperationMessageBo query);
}
