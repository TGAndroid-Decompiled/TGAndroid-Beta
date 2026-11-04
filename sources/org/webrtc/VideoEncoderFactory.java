package org.webrtc;
public interface VideoEncoderFactory {

    public interface VideoEncoderSelector {
        VideoCodecInfo onAvailableBitrate(int i3);

        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        VideoCodecInfo onEncoderBroken();

        VideoCodecInfo onResolutionChange(int i3, int i10);
    }

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    VideoEncoderSelector getEncoderSelector();

    VideoCodecInfo[] getImplementations();

    VideoCodecInfo[] getSupportedCodecs();
}
