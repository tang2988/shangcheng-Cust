package com.shangcheng.Util;

public class ResultData {

	/**
	 * 返回码
	 */
	private String StatusCode;

	/**
	 * 返回结果对象
	 */
	private Object Data;

	/**
	 * msg提示字符串
	 */
	private String Msg;

	public ResultData(String statusCode, Object data, String msg) {
		super();
		StatusCode = statusCode;
		Data = data;
		Msg = msg;
	}

	public ResultData() {
		super();
	}

	public String getStatusCode() {
		return StatusCode;
	}

	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public String toString() {
		return "ResultData [StatusCode=" + StatusCode + ", Data=" + Data + ", Msg=" + Msg + "]";
	}
	
	

	

}
