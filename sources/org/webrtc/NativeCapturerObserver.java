package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public NativeCapturerObserver(long j10) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j10);
    }

    @Override
    public void onCapturerStarted(boolean z4) {
        this.nativeAndroidVideoTrackSource.setState(z4);
    }

    @Override
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame != null && !adaptFrame.drop) {
            VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
            this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
            cropAndScale.release();
        }
    }
}
