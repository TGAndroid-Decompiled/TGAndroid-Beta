package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class ub1 extends h7.w5 {

    public final int f43181a;

    public final NotificationCenter.NotificationCenterDelegate f43182b;

    public ub1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43181a = i10;
        this.f43182b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f43181a) {
            case 1:
                ((lh1) this.f43182b).v.invalidate();
                break;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f43181a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((nc1) this.f43182b).f40784t0.invalidate();
                }
                break;
        }
    }
}
