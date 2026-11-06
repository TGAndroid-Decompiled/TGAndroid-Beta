package org.webrtc;

import org.webrtc.EncodedImage;
public interface VideoEncoder {

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int[][] iArr;
            int i7 = 0;
            for (int[] iArr2 : this.bitratesBbs) {
                for (int i10 : iArr2) {
                    i7 += i10;
                }
            }
            return i7;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class Capabilities {
        public final boolean lossNotification;

        public Capabilities(boolean z9) {
            this.lossNotification = z9;
        }
    }

    public static class CodecSpecificInfo {
    }

    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i7, boolean z9) {
            this.requestedResolutionAlignment = i7;
            this.applyAlignmentToAllSimulcastLayers = z9;
        }

        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        public RateControlParameters(BitrateAllocation bitrateAllocation, double d) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d;
        }
    }

    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i7, int i10, int i11, int i12) {
            this.frameSizePixels = i7;
            this.minStartBitrateBps = i10;
            this.minBitrateBps = i11;
            this.maxBitrateBps = i12;
        }

        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i7, int i10, int i11, int i12, int i13, int i14, boolean z9) {
            this(i7, i10, i11, i12, i13, i14, z9, new Capabilities(false));
        }

        public Settings(int i7, int i10, int i11, int i12, int i13, int i14, boolean z9, Capabilities capabilities) {
            this.numberOfCores = i7;
            this.width = i10;
            this.height = i11;
            this.startBitrate = i12;
            this.maxFramerate = i13;
            this.numberOfSimulcastStreams = i14;
            this.automaticResizeOn = z9;
            this.capabilities = capabilities;
        }
    }

    long createNativeVideoEncoder();

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    EncoderInfo getEncoderInfo();

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i7);

    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public ScalingSettings(int i7, int i10) {
            this.on = true;
            this.low = Integer.valueOf(i7);
            this.high = Integer.valueOf(i10);
        }

        public String toString() {
            if (this.on) {
                return "[ " + this.low + ", " + this.high + " ]";
            }
            return "OFF";
        }

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z9) {
            this.on = z9;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z9, int i7, int i10) {
            this.on = z9;
            this.low = Integer.valueOf(i7);
            this.high = Integer.valueOf(i10);
        }
    }
}
