package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class rc1 extends k7.y5 {
    public final int f37798a;
    public final NotificationCenter.NotificationCenterDelegate f37799b;

    public rc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37798a = i10;
        this.f37799b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f37798a) {
            case 1:
                ((ii1) this.f37799b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z4;
        switch (this.f37798a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                boolean z10 = false;
                if (point.x <= point.y) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i10 <= i11) {
                    z10 = true;
                }
                if (z4 == z10) {
                    ((jd1) this.f37799b).f35230u0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
