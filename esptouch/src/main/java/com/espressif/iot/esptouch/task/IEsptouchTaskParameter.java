package com.espressif.iot.esptouch.task;

public interface IEsptouchTaskParameter {


    long getIntervalGuideCodeMillisecond();


    long getIntervalDataCodeMillisecond();


    long getTimeoutGuideCodeMillisecond();


    long getTimeoutDataCodeMillisecond();


    long getTimeoutTotalCodeMillisecond();


    int getTotalRepeatTime();


    int getEsptouchResultOneLen();


    int getEsptouchResultMacLen();


    int getEsptouchResultIpLen();


    int getEsptouchResultTotalLen();


    int getPortListening();


    String getTargetHostname();


    int getTargetPort();


    int getWaitUdpReceivingMillisecond();


    int getWaitUdpSendingMillisecond();


    int getWaitUdpTotalMillisecond();


    void setWaitUdpTotalMillisecond(int waitUdpTotalMillisecond);


    int getThresholdSucBroadcastCount();


    int getExpectTaskResultCount();


    void setExpectTaskResultCount(int expectTaskResultCount);


    void setBroadcast(boolean broadcast);
}
