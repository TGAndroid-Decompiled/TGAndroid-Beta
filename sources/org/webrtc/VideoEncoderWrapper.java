package org.webrtc;

import org.webrtc.VideoEncoder;

public class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() {
            @Override
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage);
            }
        };
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
