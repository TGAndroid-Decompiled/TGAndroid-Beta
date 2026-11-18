package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class z70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f54441a;
    public final Object f54442b;

    public z70(Object obj, int i7) {
        this.f54441a = i7;
        this.f54442b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i7 = this.f54441a;
        Object obj = this.f54442b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = i5.c.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f24118q;
                i5.c.t(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f24113n) - org.telegram.messenger.g0.f24112m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.s2.f26721a) {
                        i5.c.t(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) obj;
                x71Var.R = SystemClock.elapsedRealtime() + 1500;
                x71Var.m0.invalidate();
                return;
        }
    }
}
