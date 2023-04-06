package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;
import org.webrtc.Predicate;
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() {
        @Override
        public Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.CC.$default$and(this, predicate);
        }

        @Override
        public Predicate<MediaCodecInfo> negate() {
            return Predicate.CC.$default$negate(this);
        }

        @Override
        public Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.CC.$default$or(this, predicate);
        }

        @Override
        public boolean test(android.media.MediaCodecInfo r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.AnonymousClass1.test(android.media.MediaCodecInfo):boolean");
        }
    };

    @Override
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context r2, org.webrtc.Predicate<android.media.MediaCodecInfo> r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate):void");
    }
}
