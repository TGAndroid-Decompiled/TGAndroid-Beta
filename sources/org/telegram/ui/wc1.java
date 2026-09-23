package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wc1 extends w7.i0 {
    public final int f38592a;
    public final NotificationCenter.NotificationCenterDelegate f38593b;

    public wc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38592a = i10;
        this.f38593b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f38592a) {
            case 1:
                ((mi1) this.f38593b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f38592a) {
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
                    ((od1) this.f38593b).f35842x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
