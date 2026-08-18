package org.webrtc;

class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    DynamicBitrateAdjuster() {
    }

    @Override
    public void setTargets(int i, double d) {
        int i2 = this.targetBitrateBps;
        if (i2 > 0 && i < i2) {
            this.deviationBytes = (this.deviationBytes * ((double) i)) / ((double) i2);
        }
        super.setTargets(i, d);
    }

    @Override
    public void reportEncodedFrame(int i) {
        double d = this.targetFramerateFps;
        if (d == 0.0d) {
            return;
        }
        double d2 = ((double) this.targetBitrateBps) / 8.0d;
        double d3 = this.deviationBytes + (((double) i) - (d2 / d));
        this.deviationBytes = d3;
        this.timeSinceLastAdjustmentMs += 1000.0d / d;
        double d4 = 3.0d * d2;
        double dMin = Math.min(d3, d4);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d4);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d2) {
            int i2 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d2) + 0.5d));
            this.bitrateAdjustmentScaleExp = i2;
            this.bitrateAdjustmentScaleExp = Math.max(i2, -20);
            this.deviationBytes = d2;
        } else {
            double d5 = -d2;
            if (dMax < d5) {
                int i3 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d2) + 0.5d));
                this.bitrateAdjustmentScaleExp = i3;
                this.bitrateAdjustmentScaleExp = Math.min(i3, 20);
                this.deviationBytes = d5;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    private double getBitrateAdjustmentScale() {
        return Math.pow(4.0d, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }
}
