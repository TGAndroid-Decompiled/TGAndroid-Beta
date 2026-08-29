package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xb1 extends i7.c6 {
    public final int f44542a;
    public final NotificationCenter.NotificationCenterDelegate f44543b;

    public xb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f44542a = i10;
        this.f44543b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f44542a) {
            case 1:
                ((oh1) this.f44543b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f44542a) {
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
                    ((qc1) this.f44543b).f41672t0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
