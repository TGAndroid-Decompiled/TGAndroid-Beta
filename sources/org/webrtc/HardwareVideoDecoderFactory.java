package org.webrtc;

import android.media.MediaCodecInfo;

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
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
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

    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        Predicate<MediaCodecInfo> predicateAnd;
        if (predicate == null) {
            predicateAnd = defaultAllowedPredicate;
        } else {
            predicateAnd = predicate.and(defaultAllowedPredicate);
        }
        super(context, predicateAnd);
    }
}
