package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;
import org.webrtc.Predicate;
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
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
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context r2, org.webrtc.Predicate<android.media.MediaCodecInfo> r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate):void");
    }

    @Override
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
