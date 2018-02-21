package com.enp.lubig.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("DeviceNO")
public class DeviceVO {
	
	private String  userKey ;
	private String  udid;
	private String  wifimac;
	private String  phoneNumber;
	private String  phoneNumberModi;
	private String  model;
	private String  osType;
	private String  osVersion;
	private String  appVersion;
	private String  regDate;
	private String  uptDate;
	private String  jID;
	private String  pushToken;
	private String  contryCode;
	private String  unlockToken;
	private String  phoneOrTab;
	private String  osInspect;
	private String  currentCarrierNetwork;
	private String  bluetooth;
	private String  GPS;
	private String  roaming; 

}
