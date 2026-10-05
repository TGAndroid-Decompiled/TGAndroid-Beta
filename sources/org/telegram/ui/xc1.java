package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xc1 extends w7.w5 {
    public final int f42887a;
    public final NotificationCenter.NotificationCenterDelegate f42888b;

    public xc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f42887a = i10;
        this.f42888b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f42887a) {
            case 1:
                ((ki1) this.f42888b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f42887a) {
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
                    ((pd1) this.f42888b).f39550x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
