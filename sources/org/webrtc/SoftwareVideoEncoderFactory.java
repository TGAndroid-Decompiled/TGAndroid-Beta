package org.webrtc;

import java.util.List;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateEncoder(long j10, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j10);

    @Override
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        final long jNativeCreateEncoder = nativeCreateEncoder(this.nativeFactory, videoCodecInfo);
        if (jNativeCreateEncoder != 0) {
            return new WrappedNativeVideoEncoder() {
                @Override
                public long createNativeVideoEncoder() {
                    return jNativeCreateEncoder;
                }

                @Override
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.w("SoftwareVideoEncoderFactory", "Trying to create encoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override
    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return y.a(this);
    }

    @Override
    public final VideoCodecInfo[] getImplementations() {
        return y.b(this);
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
