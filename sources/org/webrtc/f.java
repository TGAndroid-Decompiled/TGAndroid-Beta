package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;
public final class f implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long a;

    public f(long j) {
        this.a = j;
    }

    @Override
    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.a, videoFrame, num, num2);
    }

    @Override
    public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.a, encodedImage, codecSpecificInfo);
    }
}
