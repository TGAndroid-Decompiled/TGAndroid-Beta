package org.webrtc;

import java.util.List;
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = SoftwareVideoDecoderFactoryJni.get().createFactory();

    public interface Natives {
        long create(long j, long j2, VideoCodecInfo videoCodecInfo);

        long createFactory();

        List<VideoCodecInfo> getSupportedCodecs(long j);

        boolean isSupported(long j, VideoCodecInfo videoCodecInfo);
    }

    @Override
    public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
        if (!SoftwareVideoDecoderFactoryJni.get().isSupported(this.nativeFactory, videoCodecInfo)) {
            Logging.w("SoftwareVideoDecoderFactory", "Trying to create decoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoDecoder() {
            @Override
            public long createNative(long j) {
                return SoftwareVideoDecoderFactoryJni.get().create(SoftwareVideoDecoderFactory.this.nativeFactory, j, videoCodecInfo);
            }
        };
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) SoftwareVideoDecoderFactoryJni.get().getSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
