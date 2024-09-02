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
        double d2 = i2;
        Double.isNaN(d2);
        double d3 = (d / 8.0d) / d2;
        double d4 = this.deviationBytes;
        double d5 = i;
        Double.isNaN(d5);
        double d6 = d4 + (d5 - d3);
        this.deviationBytes = d6;
        double d7 = this.timeSinceLastAdjustmentMs;
        double d8 = i2;
        Double.isNaN(d8);
        this.timeSinceLastAdjustmentMs = d7 + (1000.0d / d8);
        double d9 = i3;
        Double.isNaN(d9);
        double d10 = d9 / 8.0d;
        double d11 = 3.0d * d10;
        double min = Math.min(d6, d11);
        this.deviationBytes = min;
        double max = Math.max(min, -d11);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d10) {
            int i4 = this.bitrateAdjustmentScaleExp - ((int) ((max / d10) + 0.5d));
            this.bitrateAdjustmentScaleExp = i4;
            this.bitrateAdjustmentScaleExp = Math.max(i4, -20);
            this.deviationBytes = d10;
        } else {
            double d12 = -d10;
            if (max < d12) {
                int i5 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d10) + 0.5d));
                this.bitrateAdjustmentScaleExp = i5;
                this.bitrateAdjustmentScaleExp = Math.min(i5, 20);
                this.deviationBytes = d12;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    private double getBitrateAdjustmentScale() {
        double d = this.bitrateAdjustmentScaleExp;
        Double.isNaN(d);
        return Math.pow(4.0d, d / 20.0d);
    }

    @Override
    public int getAdjustedBitrateBps() {
        double d = this.targetBitrateBps;
        double bitrateAdjustmentScale = getBitrateAdjustmentScale();
        Double.isNaN(d);
        return (int) (d * bitrateAdjustmentScale);
    }
}
