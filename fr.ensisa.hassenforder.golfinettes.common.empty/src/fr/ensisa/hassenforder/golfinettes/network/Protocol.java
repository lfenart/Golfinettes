package fr.ensisa.hassenforder.golfinettes.network;

public class Protocol {

    public static final int GOLFINETTES_SIGFOX_PORT = 6666;
    public static final int GOLFINETTES_WIFI_PORT	= 7777;

    // left to help you (or not)
	public static final int SIGFOX_STD				= 0x01;
	
	public static final int RQ_UPDATE_SOFTWARE		= 0x01;
	public static final int SEND_UPDATE_SOFTWARE	= 0x02;
	public static final int RP_UPDATE_SOFTWARE		= 0x101;
	public static final int RQ_UPDATE_MAP			= 0x03;
	public static final int SEND_UPDATE_MAP			= 0x04;
	public static final int RP_UPDATE_MAP			= 0x102;
	public static final int RQ_UPDATE_USER			= 0x05;
	public static final int SEND_UPDATE_USER		= 0x06;
	public static final int RP_UPDATE_USER			= 0x103;
	public static final int SEND_WIFI_EVENT		=0x07;
}
