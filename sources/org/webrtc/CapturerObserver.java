package org.webrtc;
public interface CapturerObserver {
    void onCapturerStarted(boolean z9);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
