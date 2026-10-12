package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class x implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f42816a;

    public x(long j10) {
        this.f42816a = j10;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f42816a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f42816a, encodedImage, codecSpecificInfo);
    }
}
