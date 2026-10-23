package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class sb1 extends w7.w5 {
    public final int f41431a;
    public final NotificationCenter.NotificationCenterDelegate f41432b;

    public sb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41431a = i10;
        this.f41432b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f41431a) {
            case 1:
                ((hh1) this.f41432b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f41431a) {
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
                    ((kc1) this.f41432b).f38583x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
