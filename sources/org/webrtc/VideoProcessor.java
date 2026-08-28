package org.webrtc;
public interface VideoProcessor extends CapturerObserver {

    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i9, int i10, int i11, int i12, int i13, int i14, long j10, boolean z10) {
            this.cropX = i9;
            this.cropY = i10;
            this.cropWidth = i11;
            this.cropHeight = i12;
            this.scaleWidth = i13;
            this.scaleHeight = i14;
            this.timestampNs = j10;
            this.drop = z10;
        }
    }

    void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters);

    void setSink(VideoSink videoSink);
}
