package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xb1 extends w7.w5 {
    public final int f43521a;
    public final NotificationCenter.NotificationCenterDelegate f43522b;

    public xb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43521a = i10;
        this.f43522b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f43521a) {
            case 1:
                ((nh1) this.f43522b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f43521a) {
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
                    ((pc1) this.f43522b).f40508y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
