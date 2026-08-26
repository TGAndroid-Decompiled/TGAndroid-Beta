package org.webrtc;

public interface VideoSink {
    void onFrame(VideoFrame videoFrame);

    void setParentSink(VideoSink videoSink);

    public abstract class CC {
        public static void $default$setParentSink(VideoSink videoSink, VideoSink videoSink2) {
        }
    }
}
