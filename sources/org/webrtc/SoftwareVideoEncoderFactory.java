package org.webrtc;

import java.util.List;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateEncoder(long j, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j);

    @Override
    public VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return VideoEncoderFactory.CC.$default$getEncoderSelector(this);
    }

    @Override
    public VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @Override
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        final long jNativeCreateEncoder = nativeCreateEncoder(this.nativeFactory, videoCodecInfo);
        if (jNativeCreateEncoder == 0) {
            Logging.w("SoftwareVideoEncoderFactory", "Trying to create encoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoEncoder() {
            @Override
            public boolean isHardwareEncoder() {
                return false;
            }

            @Override
            public long createNativeVideoEncoder() {
                return jNativeCreateEncoder;
            }
        };
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
