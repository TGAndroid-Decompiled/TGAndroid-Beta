package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ub1 extends w7.w5 {
    public final int f41947a;
    public final NotificationCenter.NotificationCenterDelegate f41948b;

    public ub1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41947a = i10;
        this.f41948b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f41947a) {
            case 1:
                ((jh1) this.f41948b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f41947a) {
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
                    ((mc1) this.f41948b).f39159x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
