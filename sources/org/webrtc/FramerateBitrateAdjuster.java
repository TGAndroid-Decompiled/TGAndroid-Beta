package org.webrtc;
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override
    public void setTargets(int i9, double d) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) ((i9 * 30) / d);
    }
}
