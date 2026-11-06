package org.webrtc;

import org.webrtc.VideoEncoder;
public class VideoEncoderWrapper {
    public static void a(long j3, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j3, encodedImage);
    }

    public static VideoEncoder.Callback createEncoderCallback(long j3) {
        return new w(j3);
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

    public static native void nativeOnEncodedFrame(long j3, EncodedImage encodedImage);
}
