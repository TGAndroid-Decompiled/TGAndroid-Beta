package org.webrtc;
public interface CapturerObserver {
    void onCapturerStarted(boolean z4);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
