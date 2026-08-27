package org.webrtc;

class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(4.0d, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }

    @Override
    public void reportEncodedFrame(int i10) {
        double d = this.targetFramerateFps;
        if (d == 0.0d) {
            return;
        }
        int i11 = this.targetBitrateBps;
        double d10 = (((double) i10) - ((((double) i11) / 8.0d) / d)) + this.deviationBytes;
        this.deviationBytes = d10;
        this.timeSinceLastAdjustmentMs = (1000.0d / d) + this.timeSinceLastAdjustmentMs;
        double d11 = ((double) i11) / 8.0d;
        double d12 = 3.0d * d11;
        double dMin = Math.min(d10, d12);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d12);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d11) {
            int i12 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d11) + 0.5d));
            this.bitrateAdjustmentScaleExp = i12;
            this.bitrateAdjustmentScaleExp = Math.max(i12, -20);
            this.deviationBytes = d11;
        } else {
            double d13 = -d11;
            if (dMax < d13) {
                int i13 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d11) + 0.5d));
                this.bitrateAdjustmentScaleExp = i13;
                this.bitrateAdjustmentScaleExp = Math.min(i13, 20);
                this.deviationBytes = d13;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override
    public void setTargets(int i10, double d) {
        int i11 = this.targetBitrateBps;
        if (i11 > 0 && i10 < i11) {
            this.deviationBytes = (this.deviationBytes * ((double) i10)) / ((double) i11);
        }
        super.setTargets(i10, d);
    }
}
