package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;
import org.webrtc.Predicate;
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() {
        @Override
        public final Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
            return new Predicate.AnonymousClass2(predicate);
        }

        @Override
        public final Predicate<MediaCodecInfo> negate() {
            return new Predicate.AnonymousClass3();
        }

        @Override
        public final Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
            return new Predicate.AnonymousClass1(predicate);
        }

        @Override
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
