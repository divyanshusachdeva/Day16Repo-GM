package com.graymatter.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

	private String driver;
	private String url;
	private String uname;
	private String pwd;
	
	public DataSource() {
		super();
	}
	
	public DataSource(String driver, String url, String uname, String pwd) {
		super();
		this.driver = driver;
		this.url = url;
		this.uname = uname;
		this.pwd = pwd;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Connection [driver=" + driver + ", url=" + url + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uname, pwd);
		return con;
	}
		
}
