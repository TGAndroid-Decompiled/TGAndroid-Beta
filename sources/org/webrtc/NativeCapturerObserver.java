package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

public class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public NativeCapturerObserver(long j) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    public NativeAndroidVideoTrackSource getNativeAndroidVideoTrackSource() {
        return this.nativeAndroidVideoTrackSource;
    }

    @Override
    public void onCapturerStarted(boolean z) {
        this.nativeAndroidVideoTrackSource.setState(z);
    }

    @Override
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame == null || adaptFrame.cropWidth == 0 || adaptFrame.cropHeight == 0) {
            return;
        }
        VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
        cropAndScale.release();
    }
}
