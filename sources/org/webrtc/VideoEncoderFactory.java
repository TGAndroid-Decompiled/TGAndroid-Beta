package org.webrtc;

public interface VideoEncoderFactory {

    public abstract class CC {
        public static VideoEncoderSelector $default$getEncoderSelector(VideoEncoderFactory videoEncoderFactory) {
            return null;
        }
    }

    public interface VideoEncoderSelector {

        public abstract class CC {
            public static VideoCodecInfo $default$onResolutionChange(VideoEncoderSelector videoEncoderSelector, int i, int i2) {
                return null;
            }
        }

        VideoCodecInfo onAvailableBitrate(int i);

        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        VideoCodecInfo onEncoderBroken();

        VideoCodecInfo onResolutionChange(int i, int i2);
    }

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    VideoEncoderSelector getEncoderSelector();

    VideoCodecInfo[] getImplementations();

    VideoCodecInfo[] getSupportedCodecs();
}
