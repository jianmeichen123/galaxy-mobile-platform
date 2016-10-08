package com.galaxyinternet.model.department;

import java.util.List;

import com.galaxyinternet.framework.core.model.BaseEntity;

public class DepartmentApp extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    private String name;

    private List<Department> departmentList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	
    
    
   
}
