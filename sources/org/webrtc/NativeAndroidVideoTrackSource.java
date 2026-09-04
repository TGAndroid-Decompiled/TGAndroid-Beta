package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;
public class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long j3) {
        this.nativeAndroidVideoTrackSource = j3;
    }

    public static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i10, int i11, int i12, int i13, int i14, int i15, long j3, boolean z10) {
        return new VideoProcessor.FrameAdaptationParameters(i10, i11, i12, i13, i14, i15, j3, z10);
    }

    private static native VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j3, int i10, int i11, int i12, long j10);

    private static native void nativeAdaptOutputFormat(long j3, int i10, int i11, Integer num, int i12, int i13, Integer num2, Integer num3);

    private static native void nativeOnFrameCaptured(long j3, int i10, long j10, VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j3, boolean z10);

    private static native void nativeSetState(long j3, boolean z10);

    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, Integer num, VideoSource.AspectRatio aspectRatio2, Integer num2, Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z10) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z10);
    }

    public void setState(boolean z10) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z10);
    }
}
