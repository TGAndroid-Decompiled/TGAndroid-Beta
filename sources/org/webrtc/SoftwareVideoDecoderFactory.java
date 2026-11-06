package org.webrtc;

import java.util.List;
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    public static native long nativeCreate(long j3, long j10, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j3);

    private static native boolean nativeIsSupported(long j3, VideoCodecInfo videoCodecInfo);

    @Override
    public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
        if (!nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            Logging.w("SoftwareVideoDecoderFactory", "Trying to create decoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoDecoder() {
            @Override
            public long createNative(long j3) {
                return SoftwareVideoDecoderFactory.nativeCreate(SoftwareVideoDecoderFactory.this.nativeFactory, j3, videoCodecInfo);
            }
        };
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
