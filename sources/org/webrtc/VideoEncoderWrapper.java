package org.webrtc;

import org.webrtc.VideoEncoder;
public class VideoEncoderWrapper {
    public static void a(long j, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j, encodedImage);
    }

    public static VideoEncoder.Callback createEncoderCallback(long j) {
        return new f(j);
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

    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
