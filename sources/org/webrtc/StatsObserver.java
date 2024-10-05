package org.webrtc;

public interface StatsObserver {
    void onComplete(StatsReport[] statsReportArr);
}
