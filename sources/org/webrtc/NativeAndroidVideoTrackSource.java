package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;
public class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public interface Natives {
        VideoProcessor.FrameAdaptationParameters adaptFrame(long j, int i, int i2, int i3, long j2);

        void adaptOutputFormat(long j, int i, int i2, Integer num, int i3, int i4, Integer num2, Integer num3);

        void onFrameCaptured(long j, int i, long j2, VideoFrame.Buffer buffer);

        void setIsScreencast(long j, boolean z);

        void setState(long j, boolean z);
    }

    public NativeAndroidVideoTrackSource(long j) {
        this.nativeAndroidVideoTrackSource = j;
    }

    public static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        return new VideoProcessor.FrameAdaptationParameters(i, i2, i3, i4, i5, i6, j, z);
    }

    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return NativeAndroidVideoTrackSourceJni.get().adaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, Integer num, VideoSource.AspectRatio aspectRatio2, Integer num2, Integer num3) {
        NativeAndroidVideoTrackSourceJni.get().adaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        NativeAndroidVideoTrackSourceJni.get().onFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z) {
        NativeAndroidVideoTrackSourceJni.get().setIsScreencast(this.nativeAndroidVideoTrackSource, z);
    }

    public void setState(boolean z) {
        NativeAndroidVideoTrackSourceJni.get().setState(this.nativeAndroidVideoTrackSource, z);
    }
}
