package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class yb1 extends w7.w5 {
    public final int f43766a;
    public final NotificationCenter.NotificationCenterDelegate f43767b;

    public yb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43766a = i10;
        this.f43767b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f43766a) {
            case 1:
                ((oh1) this.f43767b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f43766a) {
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
                    ((qc1) this.f43767b).f40779y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
