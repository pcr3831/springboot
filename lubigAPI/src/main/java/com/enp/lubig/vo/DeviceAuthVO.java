package com.enp.lubig.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("DeviceAuthVO")
public class DeviceAuthVO {
	private String userKey;
	private String udid;
	private String authDate;
	private String authToken;
	private String authTokenDate;
	private String authCheck;
	private String modyDate;
}
