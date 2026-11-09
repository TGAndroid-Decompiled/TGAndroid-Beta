package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class v implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f53081a;

    public v(long j3) {
        this.f53081a = j3;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f53081a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f53081a, encodedImage, codecSpecificInfo);
    }
}
