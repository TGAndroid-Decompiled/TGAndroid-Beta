package org.webrtc;
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    @Override
    public void setTargets(int i, int i2) {
        int i3 = this.targetBitrateBps;
        if (i3 > 0 && i < i3) {
            double d = this.deviationBytes;
            double d2 = i;
            Double.isNaN(d2);
            double d3 = d * d2;
            double d4 = i3;
            Double.isNaN(d4);
            this.deviationBytes = d3 / d4;
        }
        super.setTargets(i, i2);
    }

    @Override
    public void reportEncodedFrame(int i) {
        int i2 = this.targetFps;
        if (i2 == 0) {
            return;
        }
        int i3 = this.targetBitrateBps;
        double d = i3;
        Double.isNaN(d);
        double d2 = d / BITS_PER_BYTE;
        double d3 = i2;
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = this.deviationBytes;
        double d6 = i;
        Double.isNaN(d6);
        double d7 = d5 + (d6 - d4);
        this.deviationBytes = d7;
        double d8 = this.timeSinceLastAdjustmentMs;
        double d9 = i2;
        Double.isNaN(d9);
        this.timeSinceLastAdjustmentMs = d8 + (1000.0d / d9);
        double d10 = i3;
        Double.isNaN(d10);
        double d11 = d10 / BITS_PER_BYTE;
        double d12 = BITRATE_ADJUSTMENT_SEC * d11;
        double min = Math.min(d7, d12);
        this.deviationBytes = min;
        double max = Math.max(min, -d12);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d11) {
            int i4 = this.bitrateAdjustmentScaleExp - ((int) ((max / d11) + 0.5d));
            this.bitrateAdjustmentScaleExp = i4;
            this.bitrateAdjustmentScaleExp = Math.max(i4, -20);
            this.deviationBytes = d11;
        } else {
            double d13 = -d11;
            if (max < d13) {
                int i5 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d11) + 0.5d));
                this.bitrateAdjustmentScaleExp = i5;
                this.bitrateAdjustmentScaleExp = Math.min(i5, 20);
                this.deviationBytes = d13;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    private double getBitrateAdjustmentScale() {
        double d = this.bitrateAdjustmentScaleExp;
        Double.isNaN(d);
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, d / 20.0d);
    }

    @Override
    public int getAdjustedBitrateBps() {
        double d = this.targetBitrateBps;
        double bitrateAdjustmentScale = getBitrateAdjustmentScale();
        Double.isNaN(d);
        return (int) (d * bitrateAdjustmentScale);
    }
}
