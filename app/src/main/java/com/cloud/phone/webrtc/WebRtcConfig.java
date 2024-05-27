package com.cloud.phone.webrtc;

import com.cloud.phone.model.DeviceType;

/**
 * @author senduo.ouyang
 * @date 2020-10-12
 * @version 1.0
 *
 * 这里的ip地址已经改成了测试地址，
 * 如果需要正常运行功能， 需要使用自己的nat地址，和websocket地址
 */
public class WebRtcConfig {
    //stun服务器配置
    public static final String STUN_URI = "stun:114.55.114.193:13478";
    public static final String STUN_USER_NAME = "";
    public static final String STUN_PASSWORD = "";
    //turn服务器配置
    public static final String TURN_URI = "turn:114.55.114.193:13478";
    public static final String TURN_USER_NAME = "dataant";
    public static final String TURN_PASSWORD = "dataant666";
    //socket
    public static final String SOCKET_URI = "ws://114.55.114.193:13477/";

    //是否开启Candidate延迟队列
    public static final boolean enableDelayQueue = false;
}
