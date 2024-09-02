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
        double d = this.targetBitrateBps;
        Double.isNaN(d);
        double d2 = d / 8.0d;
        double d3 = i2;
        Double.isNaN(d3);
        double d4 = this.deviationBytes;
        double d5 = i;
        Double.isNaN(d5);
        double d6 = d4 + (d5 - (d2 / d3));
        this.deviationBytes = d6;
        double d7 = this.timeSinceLastAdjustmentMs;
        Double.isNaN(d3);
        this.timeSinceLastAdjustmentMs = d7 + (1000.0d / d3);
        double d8 = 3.0d * d2;
        double min = Math.min(d6, d8);
        this.deviationBytes = min;
        double max = Math.max(min, -d8);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d2) {
            int i3 = this.bitrateAdjustmentScaleExp - ((int) ((max / d2) + 0.5d));
            this.bitrateAdjustmentScaleExp = i3;
            this.bitrateAdjustmentScaleExp = Math.max(i3, -20);
            this.deviationBytes = d2;
        } else {
            double d9 = -d2;
            if (max < d9) {
                int i4 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d2) + 0.5d));
                this.bitrateAdjustmentScaleExp = i4;
                this.bitrateAdjustmentScaleExp = Math.min(i4, 20);
                this.deviationBytes = d9;
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
