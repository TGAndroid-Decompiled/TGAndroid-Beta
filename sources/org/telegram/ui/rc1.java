package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class rc1 extends k7.z5 {
    public final int f40814a;
    public final NotificationCenter.NotificationCenterDelegate f40815b;

    public rc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f40814a = i10;
        this.f40815b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f40814a) {
            case 1:
                ((ii1) this.f40815b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z4;
        switch (this.f40814a) {
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
                    ((jd1) this.f40815b).f38013u0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
