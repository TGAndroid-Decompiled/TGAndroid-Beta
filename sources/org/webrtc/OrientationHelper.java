package org.webrtc;

import android.view.OrientationEventListener;
import org.telegram.messenger.ApplicationLoader;

public class OrientationHelper {
    private static final int ORIENTATION_HYSTERESIS = 5;
    public static volatile int cameraOrientation;
    public static volatile int cameraRotation;
    private OrientationEventListener orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
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

    protected void onOrientationUpdate(int i) {
    }

    public int roundOrientation(int i, int i2) {
        boolean z = true;
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                z = false;
            }
        }
        return z ? (((i + 45) / 90) * 90) % 360 : i2;
    }

    public void start() {
        if (this.orientationEventListener.canDetectOrientation()) {
            this.orientationEventListener.enable();
            return;
        }
        this.orientationEventListener.disable();
        this.orientationEventListener = null;
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public int getOrientation() {
        return this.rotation;
    }
}
