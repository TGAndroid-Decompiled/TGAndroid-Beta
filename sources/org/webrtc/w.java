package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class w implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f43909a;

    public w(long j10) {
        this.f43909a = j10;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f43909a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f43909a, encodedImage, codecSpecificInfo);
    }
}
