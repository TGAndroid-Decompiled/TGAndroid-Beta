package org.webrtc;

import java.util.List;
import org.webrtc.VideoEncoderFactory;
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = SoftwareVideoEncoderFactoryJni.get().createFactory();

    public interface Natives {
        long create(long j, long j2, VideoCodecInfo videoCodecInfo);

        long createFactory();

        List<VideoCodecInfo> getSupportedCodecs(long j);

        boolean isSupported(long j, VideoCodecInfo videoCodecInfo);
    }

    @Override
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (!SoftwareVideoEncoderFactoryJni.get().isSupported(this.nativeFactory, videoCodecInfo)) {
            Logging.w("SoftwareVideoEncoderFactory", "Trying to create encoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoEncoder() {
            @Override
            public long createNative(long j) {
                return SoftwareVideoEncoderFactoryJni.get().create(SoftwareVideoEncoderFactory.this.nativeFactory, j, videoCodecInfo);
            }

            @Override
            public boolean isHardwareEncoder() {
                return false;
            }
        };
    }

    @Override
    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @Override
    public final VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) SoftwareVideoEncoderFactoryJni.get().getSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
