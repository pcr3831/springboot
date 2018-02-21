package com.enp.lubig.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("MemberVO")
public class MemberVO {

	private String userKey;
	private String name;
	private String shortText;
	private String phoneNum;
	private String email;
	private String passwd;
	private String appStatus;
	private String pushToken;
	private String regDate;
	private String uptDate;
	private String storeKey;
	private String profileSeq;
}
