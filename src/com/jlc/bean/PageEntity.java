package com.jlc.bean;

import java.io.Serializable;

public class PageEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private int currentPage = 1;
	private int pageSize = 10;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
