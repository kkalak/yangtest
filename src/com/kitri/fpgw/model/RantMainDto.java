package com.kitri.fpgw.model;

import java.util.Date;

public class RantMainDto {

	private String strRMYmd;			//����		20160218
	private String strRMGetUser;		//�����
	private Date datRMGetDate;			//��Ͻð�
	private String strRMEditUser;		//������
	private Date datRMEditDate;			//�����ð�
	private String strRMStartTime;		//���۽ð�
	private String strRMEndTime;		//����ð�
	private String strRMRantProd;		//�뿩ǰ
	private String strRMRantBcode;		//�뿩ǰ ����
	private String strRMReqUser;		//��û��
	private String strRMApproUser;		//������
	private String strRMReqMemo;		//��û����
	private String strRMMemo;			//�޸�
	
	public RantMainDto(String strRMYmd, String strRMGetUser, Date datRMGetDate, String strRMEditUser,
			Date datRMEditDate, String strRMStartTime, String strRMEndTime, String strRMRantProd, String strRMRantBcode,
			String strRMReqUser, String strRMApproUser, String strRMReqMemo, String strRMMemo) {

		this.strRMYmd = strRMYmd;
		this.strRMGetUser = strRMGetUser;
		this.datRMGetDate = datRMGetDate;
		this.strRMEditUser = strRMEditUser;
		this.datRMEditDate = datRMEditDate;
		this.strRMStartTime = strRMStartTime;
		this.strRMEndTime = strRMEndTime;
		this.strRMRantProd = strRMRantProd;
		this.strRMRantBcode = strRMRantBcode;
		this.strRMReqUser = strRMReqUser;
		this.strRMApproUser = strRMApproUser;
		this.strRMReqMemo = strRMReqMemo;
		this.strRMMemo = strRMMemo;
	}

	public RantMainDto() {
		
	}

	public String getStrRMYmd() {
		return strRMYmd;
	}

	public void setStrRMYmd(String strRMYmd) {
		this.strRMYmd = strRMYmd;
	}

	public String getStrRMGetUser() {
		return strRMGetUser;
	}

	public void setStrRMGetUser(String strRMGetUser) {
		this.strRMGetUser = strRMGetUser;
	}

	public Date getDatRMGetDate() {
		return datRMGetDate;
	}

	public void setDatRMGetDate(Date datRMGetDate) {
		this.datRMGetDate = datRMGetDate;
	}

	public String getStrRMEditUser() {
		return strRMEditUser;
	}

	public void setStrRMEditUser(String strRMEditUser) {
		this.strRMEditUser = strRMEditUser;
	}

	public Date getDatRMEditDate() {
		return datRMEditDate;
	}

	public void setDatRMEditDate(Date datRMEditDate) {
		this.datRMEditDate = datRMEditDate;
	}

	public String getStrRMStartTime() {
		return strRMStartTime;
	}

	public void setStrRMStartTime(String strRMStartTime) {
		this.strRMStartTime = strRMStartTime;
	}

	public String getStrRMEndTime() {
		return strRMEndTime;
	}

	public void setStrRMEndTime(String strRMEndTime) {
		this.strRMEndTime = strRMEndTime;
	}

	public String getStrRMRantProd() {
		return strRMRantProd;
	}

	public void setStrRMRantProd(String strRMRantProd) {
		this.strRMRantProd = strRMRantProd;
	}

	public String getStrRMRantBcode() {
		return strRMRantBcode;
	}

	public void setStrRMRantBcode(String strRMRantBcode) {
		this.strRMRantBcode = strRMRantBcode;
	}

	public String getStrRMReqUser() {
		return strRMReqUser;
	}

	public void setStrRMReqUser(String strRMReqUser) {
		this.strRMReqUser = strRMReqUser;
	}

	public String getStrRMApproUser() {
		return strRMApproUser;
	}

	public void setStrRMApproUser(String strRMApproUser) {
		this.strRMApproUser = strRMApproUser;
	}

	public String getStrRMReqMemo() {
		return strRMReqMemo;
	}

	public void setStrRMReqMemo(String strRMReqMemo) {
		this.strRMReqMemo = strRMReqMemo;
	}

	public String getStrRMMemo() {
		return strRMMemo;
	}

	public void setStrRMMemo(String strRMMemo) {
		this.strRMMemo = strRMMemo;
	}
	
	
}
