package com.espressif.iot.esptouch;

import java.util.List;

public interface IEsptouchTask {
    String ESPTOUCH_VERSION = BuildConfig.VERSION_NAME;


    void setEsptouchListener(IEsptouchListener esptouchListener);


    void interrupt();


    IEsptouchResult executeForResult() throws RuntimeException;


    List<IEsptouchResult> executeForResults(int expectTaskResultCount) throws RuntimeException;


    boolean isCancelled();

    void setPackageBroadcast(boolean broadcast);
}
