package org.webrtc;
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override
    public void setTargets(int i10, double d) {
        this.targetBitrateBps = i10;
        this.targetFramerateFps = d;
    }

    @Override
    public void reportEncodedFrame(int i10) {
    }
}
