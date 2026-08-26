package org.webrtc;

public final class VideoDecoderWrapper$$ExternalSyntheticLambda0 implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final long f$0;

    public VideoDecoderWrapper$$ExternalSyntheticLambda0(long j) {
        this.f$0 = j;
    }

    @Override
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f$0, videoFrame, num, num2);
    }

    @Override
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f$0, encodedImage);
    }
}
