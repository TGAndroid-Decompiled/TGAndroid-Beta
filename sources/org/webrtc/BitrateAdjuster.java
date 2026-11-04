package org.webrtc;
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i3);

    void setTargets(int i3, double d);
}
