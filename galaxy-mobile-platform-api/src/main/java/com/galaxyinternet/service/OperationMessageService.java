package com.galaxyinternet.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.galaxyinternet.bo.OperationMessageBo;
import com.galaxyinternet.framework.core.model.Page;
import com.galaxyinternet.framework.core.service.BaseService;
import com.galaxyinternet.model.operationMessage.OperationMessage;

public interface OperationMessageService extends BaseService<OperationMessage> {

	//Page<OperationMessage> queryPageList(OperationMessageBo query, Pageable pageable);

	
	Long selectCount(OperationMessage query);
	
	//添加分页对象 为新的消息列表 
	Page<OperationMessage> selectListMessage(OperationMessageBo query, Pageable pageable);
	
	//获取消息列表
	List<OperationMessage> selectList(OperationMessageBo queryo);
}
