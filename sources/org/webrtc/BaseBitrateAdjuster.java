package org.webrtc;

class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected int targetFps;

    @Override
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override
    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override
    public void reportEncodedFrame(int i) {
    }

    @Override
    public void setTargets(int i, int i2) {
        this.targetBitrateBps = i;
        this.targetFps = i2;
    }
}
