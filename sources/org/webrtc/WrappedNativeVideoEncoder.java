package org.webrtc;

import org.webrtc.VideoEncoder;

public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override
    public abstract long createNativeVideoEncoder();

    @Override
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return VideoEncoder.CC.$default$getEncoderInfo(this);
    }

    @Override
    public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return VideoEncoder.CC.$default$getResolutionBitrateLimits(this);
    }

    @Override
    public abstract boolean isHardwareEncoder();

    @Override
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        VideoCodecStatus rateAllocation;
        rateAllocation = setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
        return rateAllocation;
    }

    @Override
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
