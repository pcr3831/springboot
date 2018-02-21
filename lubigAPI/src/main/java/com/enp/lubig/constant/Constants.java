package com.enp.lubig.constant;

/**
 * Constants(상수) 클래스
 * 
 * @author 한은수
 * @since 2018.01.11
 * @version 1.0
 * @see
 * 
 *      <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2013.03.31  ohes            최초 생성
 * 
 *      </pre>
 */

public class Constants {

	public static final String FILE_URL = "http://sv02.lubig.co.kr:8080";
	public static final String SERVER_XMPP = "sv01.lubig.co.kr";
	// public static final String SERVER_XMPP = "localhost";
	public static final String SERVER_XMPP_PORT = "5222";

	public static final String PATH_LUBIG = "";

	public static String FILE_PATH = "C:/Users/Administrator/Desktop/";
	public static final String FILE_PATH_UPLOAD = "/upload/";
	public static final String FILE_PATH_IMAGE_UPLOAD = "/upload/Image";
	public static final String LABEL_UTF_8 = "UTF-8";
	public static final String REDIRECT = "redirect:/";
	public static final String RESULT = "result";
	public static final String RESULT_CODE = "resultCode";
	public static final String RESULT_MSG = "resultMsg";
	public static final String PARAM_MSG = "msg";
	public static final String SUCCESS = "Success";
	public static final String FAILED = "Failed";
	public static final String APP_JSON = "application/json";
	public static final String RETURN_FR_DATA = "frData";
	public static final String RETURN_AD_DATA = "adData";
	public static final String RETURN_RE_DATA = "reData";
	public static final String PARAM_ADD_CNT = "addCnt";

	public static final int SENDTYPE_VOICE = 1;
	public static final int SENDTYPE_PROFILE = 2;
	public static final int SENDTYPE_SNS = 3;

	public static final String PAGE_INDEX = "index";

	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_DD = "yyyy-MM-dd";

	public static final String VALUE_MSG_INSERT_ERROR = "insert 오류!";
	public static final String VALUE_MSG_SELECT_ERROR = "select 오류!";
	public static final String VALUE_MSG_UPDATE_ERROR = "update 오류!";

	public static final String BASE_PACKAGE = "com.enp.lubig";
	
	/* ERROR CODE */
	public static final String ERROR_CODE_0001 = "0001"; // Exception
	public static final String ERROR_CODE_0002 = "0002"; // RuntimeException
	public static final String ERROR_CODE_0003 = "0003"; // SQLException
	public static final String ERROR_CODE_0004 = "0004"; // FileUploadException
	public static final String ERROR_CODE_0005 = "0005"; // NullPointerException
	public static final String ERROR_CODE_0006 = "0006"; // IOException
	public static final String ERROR_CODE_0007 = "0007"; // ParseException
	public static final String ERROR_CODE_0008 = "0008"; // MappingException
	public static final String ERROR_CODE_0009 = "0009"; // UserNotFoundException

	public static final String ERROR_CODE_0401 = "0401"; // HttpMessageNotReadableException

	/* ERROR MESSAGE */
	public static final String ERROR_MSG_0001 = "알수없는 오류"; // Exception
	public static final String ERROR_MSG_0002 = "런타임 오류"; // RuntimeException
	public static final String ERROR_MSG_0003 = "SQL구문 오류"; // SQLException
	public static final String ERROR_MSG_0004 = "파일 업로드 오류"; // FileUploadException
	public static final String ERROR_MSG_0005 = "null 포인트 오류"; // NullPointerException
	public static final String ERROR_MSG_0006 = "IO 오류"; // IOException
	public static final String ERROR_MSG_0007 = "파싱 오류"; // ParseException
	public static final String ERROR_MSG_0008 = "매핑 오류"; // MappingException
	public static final String ERROR_MSG_0009 = "사용자를 찾을수 없음"; // UserNotFoundException

	public static final String ERROR_MSG_0401 = "request MethodType이 잘못되었습니다."; // HttpMessageNotReadableException

	/** 시스템 구분코드 */

	/* AUTH MESSAGE */

	public static final String AUTH_MSG_0001 = "가입된 단말 정보가 존재 하지 않음 / 회원가입으로 이동 처리  S->C";
	public static final String AUTH_MSG_0002 = "이미 가입된 단말 정보가 존재함 ";
	public static final String AUTH_MSG_0003 = "이미 가입된 단말 정보가 존재함 ";
	public static final String AUTH_MSG_0004 = "이미 가입된 단말 정보가 존재함 ";
	public static final String AUTH_MSG_0005 = "이미 가입된 단말 정보가 존재함 / 회원가입으로 이동";

	/** 정상/비정상 구분코드 */
	public final static String SYS_LOG_CODE_NORMAL = "001";
	public final static String SYS_LOG_CODE_ABNORMAL = "002";

	/** 공통 코드 */
	@Deprecated
	public final static String CLASS_CODE_BTRTL = "BTRTL"; // 상위조직
	@Deprecated
	public final static String CLASS_CODE_JIKGUN = "JIKGUN"; // 직군
	@Deprecated
	public final static String CLASS_CODE_JIKJON = "JIKJON"; // 직종
	@Deprecated
	public final static String CLASS_CODE_JIKWID = "JIKWID"; // 직위
	@Deprecated
	public final static String CLASS_CODE_PERSK = "PERSK"; // 직능
	@Deprecated
	public final static String CLASS_CODE_PERSG = "PERSG"; // 재직구분
	@Deprecated
	public final static String CLASS_CODE_DEPTCO = "DEPTCO"; // 실국

	public final static String CLASS_CODE_DEVICE_REG_TYPE = "DVTP"; // 단말기구분 등록/미등록
	public final static String CLASS_CODE_DEVICE_OS_TYPE = "OS"; // 단말기 OS구분
	public final static String CLASS_CODE_PUSH_COMMAND_TYPE = "PC"; // Push Type
	public final static String CLASS_CODE_PUSH_LEVEL = "PT"; // Push Level
	public final static String CLASS_CODE_GRPTP = "GRPTP"; // 그룹분류
	public final static String CLASS_CODE_APP_DEVICE_TYPE = "APPTP"; // 앱 OS구분
	public final static String CLASS_CODE_DEVICE_TYPE = "PT"; // 단말기구분
	public final static String CLASS_CODE_PUSH_RESERVATION_TYPE = "PRT";// Push 예약 구분
	public final static String CLASS_CODE_IMDM_PUSH_COMMAND_TYPE = "PL"; // iOS MDM Push Command
	public final static String CLASS_CODE_AMDM_PUSH_COMMAND_TYPE = "PC"; // Android MDM Push Command

	@Deprecated
	public final static String CLASS_CODE_SYSTEM_TYPE = "SYSGRP"; // 주요시스템그룹
	@Deprecated
	public final static String CLASS_CODE_SYSTEM_STATUS = "STS"; // 주요시스템상태
	@Deprecated
	public final static String CLASS_CODE_CONTACT_TEL = "CT"; // 주요연락처
	@Deprecated
	public final static String CLASS_CODE_BATCH_STATUS = "BS"; // 배치 상태
	@Deprecated
	public final static String CLASS_CODE_BATCH = "BATCH"; // 배치
	@Deprecated
	public final static String CLASS_CODE_PROMOTION = "PROMO"; // 프로모션

	public final static String CLASS_CODE_ANDROID_MDM_ZONE_PUSH = "8"; // Android MDM SpeedGate Push
	public final static String CLASS_CODE_PUSH_SEND_TYPE = "PS";
	public final static String CLASS_CODE_IOS_PUSH_QUEUE_THREAD = "QT";

	public final static String COMMON_CODE_ADMIN_GROUP_ADMIN = "AG01";

	public final static String COMMON_CODE_OS_ANDROID = "A";
	public final static String COMMON_CODE_OS_IOS = "I";
	public final static String PUSH_COMMAND_TYPE_MESSAGE = "PC01"; // Push Command Type(Not MDM)
	public final static String PUSH_COMMAND_MESSAGE = "MSG"; // Push Message(Not MDM)
	public final static String PUSH_STATE_SUCCESS = "Y";
	public final static String PUSH_STATE_FAIL = "N";
	public final static String PUSH_IMMEDIATE_TYPE = "PRT002"; // Push 즉시발송
	public final static String PUSH_LEVEL_A = "PT01"; // Push Level(Push + SMS)
	public final static String PUSH_LEVEL_B = "PT02"; // Push Level(Push 실패 시 SMS)
	public final static String PUSH_LEVEL_C = "PT03"; // Push Level(Push)
	public final static String COMMON_CODE_PLIST = "PLIST"; // plist default xml
	public final static String COMMON_CODE_IOS_PUSH_QUEUE_THREAD = "QTC";

	public final static String PUSH_SEND_STATE_SUCCESS = "PS01"; // Push Send Result : Success
	public final static String PUSH_SEND_STATE_FAILURE = "PS02"; // Push Send Result : Failure
	public final static String PUSH_SEND_STATE_PROHIBITION = "PS03"; // Push Send Result : Skip

	public static final String HTTPS_PROTOCOL = "https://";
	public static final String HTTP_PROTOCOL = "http://";

	/** 전체서비스 */
	@Deprecated
	public final static String COMMON_CONTACT_WEB_INSIDE = "CW02"; // 전체서비스 사내 웹 서비스
	@Deprecated
	public final static String COMMON_CONTACT_WEB_OUTSIDE = "CW03"; // 전체서비스 사외 웹 서비스

	/** 권한관리 */
	@Deprecated
	public final static String IS_AUTH_ADMIN_LOGIN = "Y";
	@Deprecated
	public final static String AUTH_ADMIN_GROUP_ID = "G01";
	@Deprecated
	public final static String AUTH_ANNOUNCER_GROUP_ID = "G02";
	@Deprecated
	public final static String AUTH_DEVELOPER_GROUP_ID = "G03";

	/** 앱 아이디 */
	public final static String APPS_ASK_EMAIL_TITLE = "[MobiCap]";

	/** 개인별 등록 가능한 기기 수 */
	@Deprecated
	public final static int EMPLOYEE_DEVICE_REGISTER_LIMITED_COUNT = 3;

	@Deprecated
	public final static String COOKIE_USER_ID = "id";

	/** Android MDM */
	public static final String ANDROID_PACKAGE_NAME_MESSAGE_TYPES_PACKAGE = "kr.co.poscoict.swp.mdm.android.protocol.messageTypes";
	public static final String ANDROID_PACKAGE_NAME_STATUS_PACKAGE = "kr.co.poscoict.swp.mdm.android.protocol.status";

	/** MDM */
	public static final String PACKAGE_NAME_MESSAGE_TYPES_PACKAGE = "kr.co.poscoict.swp.mdm.ios.protocol.messageTypes";
	public static final String PACKAGE_NAME_STATUS_PACKAGE = "kr.co.poscoict.swp.mdm.ios.protocol.status";
	public static final String PACKAGE_NAME_PAYLOADS_PACKAGE = "kr.co.poscoict.swp.mdm.ios.protocol.payloads";
	public static final String ACCESS_AUTHENTICATE_DEFAULT_ENABLE_VALUE = "Y";
	public static final String WEBSERVICE_COMPANYCODE = "포스코외주사";
	public static final String WEBSERVICE_ATTRIBUTE_Y = "Y";
	public static final String WEBSERVICE_ATTRIBUTE_N = "N";
	public static final String WEBSERVICE_ZONSTATUS_IN = "I";
	public static final String WEBSERVICE_ZONSTATUS_OUT = "O";

	/** iOS MDM Status */

	@Deprecated
	public static final String SMS_USED_CD = "00"; // 일반 SMS
	@Deprecated
	public static final String SMS_RESERVED_YN_IMMEDIATELY = "I"; // 즉시발송
	@Deprecated
	public static final String SMS_RESERVED_YN_RESETRVED = "R"; // 예약발송

	@Deprecated
	public static final String SMS_SEND_SUCCESS = "0"; // SUCCESS

	/** WEbservice error code */
	public static final String WEBSERVICE_SUCCESS = "0"; // SUCCESS
	public static final String WEBSERVICE_FAILURE = "-1"; // FAILURE
	public static final String WEBSERVICE_INVALID_PARAM = "-2"; // invalid parameter
	// public static final String PUSH_RESERVED_INVALID_PARAM = "-3"; // invalid
	// push schedule parameter

	@Deprecated
	public static final String PUSH_BLOCK_DEFAULT_START_TIME = "19:00"; // 방해금지 메뉴를 한번도 이용하지 않은 사용자, 업무시간 외 push block
																		// default time
	@Deprecated
	public static final String PUSH_BLOCK_DEFAULT_END_TIME = "08:50"; // 방해금지 메뉴를 한번도 이용하지 않은 사용자, 업무시간 외 push block
																		// default time

	/*
	 * iOS PUSH MAX SIZE는 256byte이나, pushSend
	 * 명령어({"aps":{"sound":"default","alert":"","badge":1},"pushUrl":""}") 를 제외한
	 * 193byte만 전송 가능
	 */
	public static final int IOS_PAYLOAD_MAX_SIZE = 193;
	public static final int IOS_PAYLOAD_LIMIT_SIZE = 110;

	@Deprecated
	public static final int MAIL_SSL_PORT = 25;

	@Deprecated
	public static final String OS_TYPE_IOS = "I";
	@Deprecated
	public static final String OS_TYPE_ANDROID = "A";
	@Deprecated
	public static final String OS_TYPE_OTHER = "O";
	@Deprecated
	public static final String EQUIP_TYPE_TABLET = "tab";
	@Deprecated
	public static final String EQUIP_TYPE_PHONE = "phn";
	@Deprecated
	public static final String EQUIP_TYPE_OTHER = "oth";

	@Deprecated
	public static final String DEVICE_EQUIP_TYPE_TABLET = "T";
	@Deprecated
	public static final String DEVICE_EQUIP_TYPE_PHONE = "P";

	public static final Integer PAPER_ROWS = 15;
	public static final Integer PAGING_LIST_SIZE = 10;

	public static final String INPUTSYSTEM_TYPE_MDM = "mdm";
	public static final String INPUTSYSTEM_TYPE_ADMIN = "admin";

	/** MDM CheckLatestApp */
	public static final String CHECK_LATEST_APP_IDENTIFIER_KEY = "identifier";
	public static final String CHECK_LATEST_APP_VERSION_KEY = "version";
	public static final String CHECK_LATEST_APP_PHONEORTAB_KEY = "phoneortab";
	public static final String CHECK_LATEST_APP_OS_KEY = "os";
	public static final String CHECK_LATEST_APP_WIFIMAC_KEY = "wifimac";

	@Deprecated
	public static final String FILE_TYPE_THEME_ICON = "FILE01";// 테마 아이콘
	@Deprecated
	public static final String FILE_TYPE_SNAPSHOT = "FILE02";// 스냅샷
	public static final String FILE_TYPE_ICON = "FILE03";// 아이콘
	public static final String FILE_TYPE_INST = "FILE04";// 설치파일
	@Deprecated
	public static final String FILE_TYPE_ETC = "FILE05";// 기타파일: 주요시스템파일
	@Deprecated
	public static final String FILE_NAME_APP_PREFIX = "swpapp";
	@Deprecated
	public static final String FILE_NAME_CONTACTAPP_PREFIX = "swpcontapp";
	@Deprecated
	public static final String FILE_NAME_CONTACTWEB_PREFIX = "swpcontweb";
	@Deprecated
	public static final String FILE_NAME_CONTACTSYS_PREFIX = "swpcontsys";

	/** SYSSTAT */
	@Deprecated
	public static final String SYSSTAT_METHOD_NM = "/m001/login.do";
	@Deprecated
	public static final String SYSSTAT_SYS_CD = "m001";

	@Deprecated
	public static final int FILE_SNAPSHOT_COUNT = 4;
	@Deprecated
	public static final int FILE_SYSTEM_COUNT = 5;

	// Portal
	@Deprecated
	public static final String PORTAL_CONFIG_TYPECL_THEME = "TH";
	@Deprecated
	public static final String PORTAL_CONFIG_TYPECL_PUSHMODE = "PM";
	@Deprecated
	public static final String COMMON_CODE_INPUTSYSTEM = "IS";
	@Deprecated
	public static final String PORTAL_CONFIG_EMP_HISTORY = "EM";

	public static final String CLASS_CODE_PHONENUMBER_REPLACE = "PR";

	// 안드로이드 HTTP 통신 KEY
	public static final String ANDROID_HTTP_PROTOCOL_UDID_KEY = "UDID";
	public static final String ANDROID_HTTP_PROTOCOL_PHONENO_KEY = "PhoneNo";
	public static final String ANDROID_HTTP_PROTOCOL_WIFIMAC_KEY = "WIFIMAC";
	public static final String ANDROID_HTTP_PROTOCOL_OSVERSION_KEY = "OSVersion";
	public static final String ANDROID_HTTP_PROTOCOL_TOKEN_KEY = "Token";
	public static final String ANDROID_HTTP_PROTOCOL_MODEL_KEY = "Model";
	public static final String ANDROID_HTTP_PROTOCOL_OSINSPECT_KEY = "OSInspect";
	public static final String ANDROID_HTTP_PROTOCOL_PHONEORTAB_KEY = "PhoneOrTab";
	public static final String ANDROID_HTTP_PROTOCOL_MDMVERSION_KEY = "MDMVersion";
	public static final String ANDROID_HTTP_PROTOCOL_PACKAGEID_KEY = "PackageID";
	public static final String ANDROID_HTTP_PROTOCOL_CAMERA_KEY = "CameraStatus";

	public static final String ANDROID_HTTP_PROTOCOL_FORCELOCATIONCHANGE_KEY = "ForceLocationChange";
	public static final String ANDROID_HTTP_PROTOCOL_CURRENTCELLID_KEY = "CurrentCellID";
	public static final String ANDROID_HTTP_PROTOCOL_CURRENTCELLINFO_KEY = "CurrentCellInfo";
	public static final String ANDROID_HTTP_PROTOCOL_CURRENTSPEEDGATEINFO_KEY = "CurrentSpeedgateInfo";
	public static final String ANDROID_HTTP_PROTOCOL_CURRENTFINALINFO_KEY = "CurrentFinalInfo";

	public static final String ANDROID_HTTP_PROTOCOL_PROFILEVERSION_KEY = "ProfileVersion";
	public static final String ANDROID_HTTP_PROTOCOL_CLIENTNAME_KEY = "ClientName";
	public static final String ANDROID_HTTP_PROTOCOL_DEVICEADMINSTATUS_KEY = "DeviceAdminStatus";
	public static final String ANDROID_HTTP_PROTOCOL_ACTION_KEY = "Action";
	public static final String ANDROID_HTTP_PROTOCOL_LOCATION_KEY = "Location";

	public static final String ANDROID_DEFAULT_PROFILE_VERSION = "19000101000000";

	public static final String ANDROID_POLICY_HEAD = "<policy>";
	public static final String ANDROID_POLICY_TAIL = "</policy>";

	public static final String ANDROID_PROFILE_MDM_HASH = "<mdmhash hashdata = '66b4c5211b75adb50486fd52004f4601c4481fb6'></mdmhash>";

	public static final String ANDROID_PACKAGE_HEAD = "<package>";
	public static final String ANDROID_PACKAGE_TAIL = "</package>";

	public static final String ANDROID_DEVICE_MANAGER_STATUS_ENABLE = "0";
	public static final String ANDROID_DEVICE_MANAGER_STATUS_DISABLE = "1";

	public static final String ANDROID_HW_LOCATION_KEY = "Location";

	public static final String ANDROID_DEVICE_SOFTWARE_PACKAGE_KEY = "PackageName";
	public static final String ANDROID_DEVICE_SOFTWARE_NAME_KEY = "Description";
	public static final String ANDROID_DEVICE_SOFTWARE_VERSION_KEY = "PackageVersion";

	/* ERROR CODE */
	public static final String NON_ACTION_CODE = "001";
	public static final String NON_ACTION = "NON ACTION";
	public static final String NO_ERROR_CODE = "0";
	public static final String NO_ERROR = "정상";
	public static final String ACCESS_DENIED_CODE = "102";
	public static final String ACCESS_DENIED = "접근거부";
	public static final String UNKNOWN_ERROR_CODE = "999";
	public static final String UNKNOWN_ERROR = " 알수 없는 에러";
	public static final String NO_CHANGE_PROFILE_CODE = "101";
	public static final String NO_CHANGE_PROFILE = "profile에 변경된 내용이 없습니다.";

	/* ZONE STATUS CODE */
	public static final String ZONE_STAUS_IN = "I";
	public static final String ZONE_STAUS_IN_TYPE = "IN";
	public static final String ZONE_STAUS_IN_CLIENT_CODE = "2";
	public static final String ZONE_STAUS_OUT = "O";
	public static final String ZONE_STAUS_OUT_TYPE = "OUT";
	public static final String ZONE_STAUS_OUT_CLIENT_CODE = "1";
	public static final String ZONE_STAUS_UNKNOWN = "U";
	public static final String ZONE_STAUS_UNKNOWN_CLIENT_CODE = "0";

	public static final String CLASS_CODE_PACKAGE = "PA";
	public static final String CLASS_CODE_POLICY = "PO";
	public static final String CLASS_CODE_PAYLOAD = "PL";
	public static final String CLASS_CODE_FILE_TYPE = "FT";
	public static final String CLASS_CODE_LOG_LEVEL = "LL";

	public static final String COMMON_CODE_POLICY_BLUETOOTH = "PO001";
	public static final String COMMON_CODE_POLICY_MOBILEAP = "PO002";
	public static final String COMMON_CODE_POLICY_TETHERRING = "PO003";
	public static final String COMMON_CODE_POLICY_WIFI = "PO004";
	public static final String COMMON_CODE_POLICY_SDCARD = "PO005";
	public static final String COMMON_CODE_POLICY_CAMERA = "PO006";
	public static final String COMMON_CODE_POLICY_USB = "PO007";
	public static final String COMMON_CODE_POLICY_PROCESS = "PO008";
	public static final String COMMON_CODE_POLICY_PASSWORD_POLICY = "PO009";
	public static final String COMMON_CODE_POLICY_MASSMEM = "PO010";
	public static final String COMMON_CODE_POLICY_MDM_HASH = "PO011";
	public static final String COMMON_CODE_POLICY_RECORD = "PO012";

	public static final String COMMON_CODE_PACKAGE_FILE = "PA001";
	public static final String COMMON_CODE_PACKAGE_INVENTORY = "PA002";
	public static final String COMMON_CODE_PACKAGE_LOG = "PA003";
	public static final String COMMON_CODE_PACKAGE_UNINSTALL_PACKAGE = "PA004";
	public static final String COMMON_CODE_PACKAGE_FOLDER_DELETE = "PA005";
	public static final String COMMON_CODE_PACKAGE_PERIOD = "PA010";

	/* Device Status CODE */
	public static final String DEVICE_HTTP_PROTOCOL_DEVICE_KEY = "deviceId";
	public static final String DEVICE_HTTP_PROTOCOL_ZONE_KEY = "zone";
	public static final String DEVICE_HTTP_PROTOCOL_CAMERA_KEY = "camera";
	public static final String DEVICE_HTTP_PROTOCOL_FACETIME_KEY = "facetime";
	public static final String DEVICE_HTTP_PROTOCOL_CAPTURE_KEY = "capture";
	public static final String DEVICE_HTTP_PROTOCOL_ICLOUD_KEY = "icloud";

	/* Android Default GroupID */
	public static final int DEFAULT_GROUP_ANDROID = 2;
	public static final int DEFAULT_GROUP_IOS = 1;

	public static final String APNS_SEND_HOST = "gateway.push.apple.com";
	public static final Integer APNS_SEND_PORT = 2195;
	public static final String APNS_FEED_BACK_HOST = "feedback.push.apple.com";
	public static final Integer APNS_FEED_BACK_PORT = 2196;
	public static final String APNS_CERTI = "/WAS/APP/SCM/DFMDM01/U100/POSCOSOFTMAN3.p12";
	public static final String APNS_MSG_CERTI = "/WAS/APP/SCM/DFMDM01/U100/swpmdmPush.p12";
	public static final String APNS_CERTI_PWD = "ias001001";
	public static final String APNS_MSG_CERTI_PWD = "posco123"; // "ias001001"

	public static class IOS {

		public static final int PAYLOAD_FIRST_DEVICEINFORMATION = 1;
		public static final String PAYLOAD_DEVICEINFOMATION_PHONENUM_KEY = "PhoneNumber";
		public static final String PAYLOAD_DEVICEINFOMATION_WIFIMAC_KEY = "WiFiMAC";
		public static final String PAYLOAD_DEVICEINFOMATION_MODEL_KEY = "Model";
		public static final String PAYLOAD_DEVICEINFOMATION_MODELNAME_KEY = "ModelName";
		public static final String PAYLOAD_DEVICEINFOMATION_MODELNAME_PHONE_VALUE = "iPhone";
		public static final String PAYLOAD_DEVICEINFOMATION_MODELNAME_PHONE = "P";
		public static final String PAYLOAD_DEVICEINFOMATION_MODELNAME_TAB = "T";

		public static final String PAYLOAD_STATUS_IDLE = "AS001";
		public static final String PAYLOAD_STATUS_ACKNOWLEDGED = "AS002";
		public static final String PAYLOAD_STATUS_NOTNOW = "AS003";
		public static final String PAYLOAD_STATUS_ERROR = "AS004";
		public static final String PAYLOAD_STATUS_COMMANDFORMATERROR = "AS005";
		public static final String PAYLOAD_STATUS_STANDBY = "AS006";
		public static final String PAYLOAD_STATUS_OUTOFFOCUS = "AS007";

		public static final String HTTP_PROTOCOL_TOKEN_KEY = "token";

		public static final int DEFAULT_PAYLOAD_CAMERA_ENABLE = 27;
		public static final int DEFAULT_PAYLOAD_CAMERA_DISABLE = 26;
		public static final int DEFAULT_PAYLOAD_FACETIME_ENABLE = 29;
		public static final int DEFAULT_PAYLOAD_FACETIME_DISABLE = 28;
		public static final int DEFAULT_PAYLOAD_SCREENCAPTURE_ENABLE = 33;
		public static final int DEFAULT_PAYLOAD_SCREENCAPTURE_DISABLE = 32;
		public static final int DEFAULT_PAYLOAD_ICLOUD_ENABLE = 31;
		public static final int DEFAULT_PAYLOAD_ICLOUD_DISABLE = 30;

	}

}
