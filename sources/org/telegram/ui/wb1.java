package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wb1 extends g7.b6 {
    public final int f43724a;
    public final NotificationCenter.NotificationCenterDelegate f43725b;

    public wb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f43724a = i9;
        this.f43725b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f43724a) {
            case 1:
                ((mh1) this.f43725b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i9, int i10) {
        boolean z10;
        switch (this.f43724a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9 <= i10) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((oc1) this.f43725b).f41105t0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
