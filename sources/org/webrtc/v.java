package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class v implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f53080a;

    public v(long j3) {
        this.f53080a = j3;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f53080a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f53080a, encodedImage, codecSpecificInfo);
    }
}
