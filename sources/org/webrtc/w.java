package org.webrtc;

public final class w implements VideoDecoder.Callback, VideoEncoder.Callback {

    public final long f45325a;

    public w(long j10) {
        this.f45325a = j10;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f45325a, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f45325a, encodedImage);
    }
}
