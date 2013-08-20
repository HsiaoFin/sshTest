package com.hzboy.action;


import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.hzboy.orm.Userinfo;
import com.hzboy.service.UserManagerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagerAct2 extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;
	
	private String temp;
	private String tip;
	
	public String test() throws Exception{
		
		ActionContext.getContext().getSession().put("1111", getTemp());
		setTip("恭喜您，"+getTemp()+"成功跳转！");
		return INPUT;//会跳到structs.xml中设置的页面（results name！）test方法
		//return SUCCESS;//会直接跳到默认的成功页面
	}

	//get，set一个都不能少，包括参数string 
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getTemp() {
		return temp;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getTip() {
		return tip;
	}
	
	
}
