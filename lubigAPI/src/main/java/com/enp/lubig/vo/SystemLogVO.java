package com.enp.lubig.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("SystemLogVO")
public class SystemLogVO {
	private int idx;
	private String ipaddr;
	private String userKey;
	private String requestParameter;
	private String requestBody;
	private String responseParameter;
	private String regDate;
	private String host;
}
