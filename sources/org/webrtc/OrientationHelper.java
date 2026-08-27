package org.webrtc;

import android.view.OrientationEventListener;
import org.telegram.messenger.ApplicationLoader;

public class OrientationHelper {
    private static final int ORIENTATION_HYSTERESIS = 5;
    public static volatile int cameraOrientation;
    public static volatile int cameraRotation;
    public static volatile boolean cameraRotationDisabled;
    private OrientationEventListener orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
        @Override
        public void onOrientationChanged(int i10) {
            if (OrientationHelper.this.orientationEventListener == null || i10 == -1) {
                return;
            }
            OrientationHelper orientationHelper = OrientationHelper.this;
            int iRoundOrientation = orientationHelper.roundOrientation(i10, orientationHelper.rotation);
            if (iRoundOrientation != OrientationHelper.this.rotation) {
                OrientationHelper orientationHelper2 = OrientationHelper.this;
                orientationHelper2.onOrientationUpdate(orientationHelper2.rotation = iRoundOrientation);
            }
        }
    };
    private int rotation;

    public int roundOrientation(int i10, int i11) {
        if (i11 != -1) {
            int iAbs = Math.abs(i10 - i11);
            if (Math.min(iAbs, 360 - iAbs) < 50) {
                return i11;
            }
        }
        return (((i10 + 45) / 90) * 90) % 360;
    }

    public int getOrientation() {
        if (cameraRotationDisabled) {
            return 0;
        }
        return this.rotation;
    }

    public void start() {
        if (this.orientationEventListener.canDetectOrientation()) {
            this.orientationEventListener.enable();
        } else {
            this.orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void onOrientationUpdate(int i10) {
    }
}
