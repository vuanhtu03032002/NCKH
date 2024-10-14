package com.espressif.iot.esptouch.task;

import com.espressif.iot.esptouch.BuildConfig;
import com.espressif.iot.esptouch.IEsptouchListener;
import com.espressif.iot.esptouch.IEsptouchResult;

import java.util.List;


public interface __IEsptouchTask {

    boolean DEBUG = BuildConfig.DEBUG;


    void setEsptouchListener(IEsptouchListener esptouchListener);


    void interrupt();


    IEsptouchResult executeForResult() throws RuntimeException;


    List<IEsptouchResult> executeForResults(int expectTaskResultCount) throws RuntimeException;

    boolean isCancelled();
}
