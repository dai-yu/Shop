package com.oracle.shop.model.javabean;

import java.io.Serializable;

/**
 * 用户表 儌僨儖僋儔僗.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Users implements Serializable {

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", nicheng=" + nicheng + "]";
	}

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 用户编号. */
	private Integer userid;

	/** 用户名. */
	private String username;

	/** 密码. */
	private String password;

	/** 昵称. */
	private String nicheng;

	/**
	 * 僐儞僗僩儔僋僞.
	 */
	public Users() {
	}

	public Users(String username, String password, String nicheng) {
		super();
		this.username = username;
		this.password = password;
		this.nicheng = nicheng;
	}

	/**
	 * 用户编号 傪愝掕偟傑偡.
	 * 
	 * @param userid
	 *            用户编号
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * 用户编号 傪庢摼偟傑偡.
	 * 
	 * @return 用户编号
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * 用户名 傪愝掕偟傑偡.
	 * 
	 * @param username
	 *            用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 用户名 傪庢摼偟傑偡.
	 * 
	 * @return 用户名
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * 密码 傪愝掕偟傑偡.
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 密码 傪庢摼偟傑偡.
	 * 
	 * @return 密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 昵称 傪愝掕偟傑偡.
	 * 
	 * @param nicheng
	 *            昵称
	 */
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}

	/**
	 * 昵称 傪庢摼偟傑偡.
	 * 
	 * @return 昵称
	 */
	public String getNicheng() {
		return this.nicheng;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Users other = (Users) obj;
		if (userid == null) {
			if (other.userid != null) {
				return false;
			}
		} else if (!userid.equals(other.userid)) {
			return false;
		}

		return true;
	}

}
