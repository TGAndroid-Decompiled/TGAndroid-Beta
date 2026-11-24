package org.webrtc;

import android.view.OrientationEventListener;
public class OrientationHelper {
    private static final int ORIENTATION_HYSTERESIS = 5;
    public static volatile int cameraOrientation;
    public static volatile int cameraRotation;
    public static volatile boolean cameraRotationDisabled;
    private OrientationEventListener orientationEventListener = new OrientationEventListener(org.telegram.messenger.a.b) {
        @Override
        public void onOrientationChanged(int i) {
            if (OrientationHelper.this.orientationEventListener != null && i != -1) {
                OrientationHelper orientationHelper = OrientationHelper.this;
                int roundOrientation = orientationHelper.roundOrientation(i, orientationHelper.rotation);
                if (roundOrientation != OrientationHelper.this.rotation) {
                    OrientationHelper orientationHelper2 = OrientationHelper.this;
                    orientationHelper2.onOrientationUpdate(orientationHelper2.rotation = roundOrientation);
                }
            }
        }
    };
    private int rotation;

    public int roundOrientation(int i, int i2) {
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                return i2;
            }
        }
        return (((i + 45) / 90) * 90) % 360;
    }

    public int getOrientation() {
        if (cameraRotationDisabled) {
            return 0;
        }
        return this.rotation;
    }

    public void start() {
        boolean canDetectOrientation = this.orientationEventListener.canDetectOrientation();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (canDetectOrientation) {
            orientationEventListener.enable();
            return;
        }
        orientationEventListener.disable();
        this.orientationEventListener = null;
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void onOrientationUpdate(int i) {
    }
}
