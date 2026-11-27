package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderWrapper;
class VideoEncoderWrapper {

    public interface Natives {
        void onEncodedFrame(long j, EncodedImage encodedImage);
    }

    public static NativeEncoderCallback createEncoderCallback(long j) {
        return new NativeEncoderCallback(j);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    static class NativeEncoderCallback implements VideoEncoder.Callback {
        private final NativeLifecycleLock lifecycleLock;

        public NativeEncoderCallback(long j) {
            this.lifecycleLock = new NativeLifecycleLock("VideoEncoderWrapper", j);
        }

        public static void lambda$onEncodedFrame$0(EncodedImage encodedImage, long j) {
            VideoEncoderWrapperJni.get().onEncodedFrame(j, encodedImage);
        }

        public void invalidate() {
            this.lifecycleLock.dispose(new g((byte) 1));
        }

        @Override
        public void onEncodedFrame(final EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
            this.lifecycleLock.runIfAlive(new NativeLifecycleLock.NativePointerRunnable() {
                @Override
                public final void run(long j) {
                    VideoEncoderWrapper.NativeEncoderCallback.lambda$onEncodedFrame$0(EncodedImage.this, j);
                }
            });
        }

        public static void lambda$invalidate$1(long j) {
        }
    }
}
