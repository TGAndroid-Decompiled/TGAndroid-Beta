package org.webrtc;

class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override
    public void setTargets(int i, double d) {
        this.targetFramerateFps = 30.0d;
        double d2 = i * 30;
        Double.isNaN(d2);
        this.targetBitrateBps = (int) (d2 / d);
    }
}
