package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zc1 extends w7.w5 {
    public final int f43748a;
    public final NotificationCenter.NotificationCenterDelegate f43749b;

    public zc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43748a = i10;
        this.f43749b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f43748a) {
            case 1:
                ((mi1) this.f43749b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f43748a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 <= i11) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((rd1) this.f43749b).f40095x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
