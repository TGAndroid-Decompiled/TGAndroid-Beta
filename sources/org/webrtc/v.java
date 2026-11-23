package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class v implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f55100a;

    public v(long j3) {
        this.f55100a = j3;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f55100a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f55100a, encodedImage, codecSpecificInfo);
    }
}
