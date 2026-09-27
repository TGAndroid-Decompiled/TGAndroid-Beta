package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xc1 extends w7.j0 {
    public final int f39604a;
    public final NotificationCenter.NotificationCenterDelegate f39605b;

    public xc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39604a = i10;
        this.f39605b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f39604a) {
            case 1:
                ((ki1) this.f39605b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f39604a) {
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
                    ((pd1) this.f39605b).f36452x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
