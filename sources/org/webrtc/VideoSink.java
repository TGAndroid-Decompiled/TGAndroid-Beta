package org.webrtc;

public interface VideoSink {

    public abstract class CC {
        public static void $default$setParentSink(VideoSink videoSink, VideoSink videoSink2) {
        }
    }

    void onFrame(VideoFrame videoFrame);

    void setParentSink(VideoSink videoSink);
}
