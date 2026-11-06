package org.webrtc;

import org.webrtc.VideoDecoder;
public class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j3) {
        return new w(j3);
    }

    public static native void nativeOnDecodedFrame(long j3, VideoFrame videoFrame, Integer num, Integer num2);
}
