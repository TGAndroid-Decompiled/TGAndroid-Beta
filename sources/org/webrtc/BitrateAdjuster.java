package org.webrtc;
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i9);

    void setTargets(int i9, double d);
}
