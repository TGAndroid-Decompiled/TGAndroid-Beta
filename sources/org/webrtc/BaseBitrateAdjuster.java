package org.webrtc;

class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override
    public void reportEncodedFrame(int i) {
    }

    @Override
    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFramerateFps = d;
    }

    @Override
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }
}
