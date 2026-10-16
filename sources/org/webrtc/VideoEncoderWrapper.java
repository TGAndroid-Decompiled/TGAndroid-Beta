package org.webrtc;

import org.webrtc.VideoEncoder;
public class VideoEncoderWrapper {
    public static void a(long j10, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j10, encodedImage);
    }

    public static VideoEncoder.Callback createEncoderCallback(long j10) {
        return new w(j10);
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

    public static native void nativeOnEncodedFrame(long j10, EncodedImage encodedImage);
}
