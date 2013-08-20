package com.hzboy.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hzboy.orm.Userinfo;
import com.hzboy.service.UserManagerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagerAct3 extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;

	private String temp;
	private String tip;

	private String textinput;
	
	public String test() throws Exception{

		HttpSession session = ServletActionContext.getRequest().getSession();
//		用下面的方法通过request可以获得username，但是不用的话username为空
		HttpServletRequest req = ServletActionContext.getRequest();
		String t = req.getParameter("textinput");
		System.out.println("123"+t);
		System.out.println("123"+textinput);
		
//		session.setAttribute("username", username);
		
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
