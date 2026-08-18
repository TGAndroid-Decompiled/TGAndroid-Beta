package org.webrtc;

class VideoEncoderWrapper {
    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);

    VideoEncoderWrapper() {
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() {
            @Override
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage);
            }
        };
    }
}
