package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.*;
import java.util.Date;
@Entity
@Table(name = "MC40200")
public class MC40200 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long currnidx;
	
	@Column(name="curncyid")
	private String curncyid;
	
	@Column(name="crncydsc")
	private String crncydsc;
	
	@Column(name ="crncydsca")
	private String  crncydsca;
	
	@Column(name="CRNCYSYM")
	private String CRNCYSYM;
	
	@Column(name="INCLSPAC ")
	private int  INCLSPAC ;
	
	@Column(name="NEGSYMBL")
	private int NEGSYMBL;
	
	@Column(name="NGSMAMPC ")
	private int NGSMAMPC ;
	
	@Column(name="DECSYMBL")
	private int DECSYMBL;
	
	@Column(name="THOUSSYM")
	private int THOUSSYM;
	
	@Column(name="CURTEXT_1 ")
	private String CURTEXT_1 ;
	
	@Column(name="CURTEXT_2 ")
	private String CURTEXT_2 ;
	
	@Column(name="CURTEXT_3 ")
	private String CURTEXT_3 ;
	
	@Column(name="CURTEXTA_1")
	private String CURTEXTA_1 ;
	
	@Column(name="CURTEXTA_2")
	private String CURTEXTA_2 ;
	
	@Column(name="CURTEXTA_3")
	private String CURTEXTA_3 ;
	
	@Column(name="DEX_ROW_TS")
	private Date DEX_ROW_TS; 
	
	@Column(name="DEX_ROW_ID")
	private int DEX_ROW_ID ;

	public long getCurrnidx() {
		return currnidx;
	}

	public void setCurrnidx(long currnidx) {
		this.currnidx = currnidx;
	}

	public String getCurncyid() {
		return curncyid;
	}

	public void setCurncyid(String curncyid) {
		this.curncyid = curncyid;
	}

	public String getCrncydsc() {
		return crncydsc;
	}

	public void setCrncydsc(String crncydsc) {
		this.crncydsc = crncydsc;
	}

	public String getCrncydsca() {
		return crncydsca;
	}

	public void setCrncydsca(String crncydsca) {
		this.crncydsca = crncydsca;
	}

	public String getCRNCYSYM() {
		return CRNCYSYM;
	}

	public void setCRNCYSYM(String cRNCYSYM) {
		CRNCYSYM = cRNCYSYM;
	}

	public int getINCLSPAC() {
		return INCLSPAC;
	}

	public void setINCLSPAC(int iNCLSPAC) {
		INCLSPAC = iNCLSPAC;
	}

	public int getNEGSYMBL() {
		return NEGSYMBL;
	}

	public void setNEGSYMBL(int nEGSYMBL) {
		NEGSYMBL = nEGSYMBL;
	}

	public int getNGSMAMPC() {
		return NGSMAMPC;
	}

	public void setNGSMAMPC(int nGSMAMPC) {
		NGSMAMPC = nGSMAMPC;
	}

	public int getDECSYMBL() {
		return DECSYMBL;
	}

	public void setDECSYMBL(int dECSYMBL) {
		DECSYMBL = dECSYMBL;
	}

	public int getTHOUSSYM() {
		return THOUSSYM;
	}

	public void setTHOUSSYM(int tHOUSSYM) {
		THOUSSYM = tHOUSSYM;
	}

	public String getCURTEXT_1() {
		return CURTEXT_1;
	}

	public void setCURTEXT_1(String cURTEXT_1) {
		CURTEXT_1 = cURTEXT_1;
	}

	public String getCURTEXT_2() {
		return CURTEXT_2;
	}

	public void setCURTEXT_2(String cURTEXT_2) {
		CURTEXT_2 = cURTEXT_2;
	}

	public String getCURTEXT_3() {
		return CURTEXT_3;
	}

	public void setCURTEXT_3(String cURTEXT_3) {
		CURTEXT_3 = cURTEXT_3;
	}

	public String getCURTEXTA_1() {
		return CURTEXTA_1;
	}

	public void setCURTEXTA_1(String cURTEXTA_1) {
		CURTEXTA_1 = cURTEXTA_1;
	}

	public String getCURTEXTA_2() {
		return CURTEXTA_2;
	}

	public void setCURTEXTA_2(String cURTEXTA_2) {
		CURTEXTA_2 = cURTEXTA_2;
	}

	public String getCURTEXTA_3() {
		return CURTEXTA_3;
	}

	public void setCURTEXTA_3(String cURTEXTA_3) {
		CURTEXTA_3 = cURTEXTA_3;
	}

	public Date getDEX_ROW_TS() {
		return DEX_ROW_TS;
	}

	public void setDEX_ROW_TS(Date dEX_ROW_TS) {
		DEX_ROW_TS = dEX_ROW_TS;
	}

	public int getDEX_ROW_ID() {
		return DEX_ROW_ID;
	}

	public void setDEX_ROW_ID(int dEX_ROW_ID) {
		DEX_ROW_ID = dEX_ROW_ID;
	}

	public MC40200(String curncyid, String crncydsc, String crncydsca, String cRNCYSYM, int iNCLSPAC,
			int nEGSYMBL, int nGSMAMPC, int dECSYMBL, int tHOUSSYM, String cURTEXT_1, String cURTEXT_2,
			String cURTEXT_3, String cURTEXTA_1, String cURTEXTA_2, String cURTEXTA_3, Date dEX_ROW_TS,
			int dEX_ROW_ID) {
		super();
		
		this.curncyid = curncyid;
		this.crncydsc = crncydsc;
		this.crncydsca = crncydsca;
		CRNCYSYM = cRNCYSYM;
		INCLSPAC = iNCLSPAC;
		NEGSYMBL = nEGSYMBL;
		NGSMAMPC = nGSMAMPC;
		DECSYMBL = dECSYMBL;
		THOUSSYM = tHOUSSYM;
		CURTEXT_1 = cURTEXT_1;
		CURTEXT_2 = cURTEXT_2;
		CURTEXT_3 = cURTEXT_3;
		CURTEXTA_1 = cURTEXTA_1;
		CURTEXTA_2 = cURTEXTA_2;
		CURTEXTA_3 = cURTEXTA_3;
		DEX_ROW_TS = dEX_ROW_TS;
		DEX_ROW_ID = dEX_ROW_ID;
	}

	public MC40200() {
		
	}
	
	
	
}
