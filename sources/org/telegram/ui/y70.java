package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class y70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f54293a;
    public final Object f54294b;

    public y70(Object obj, int i7) {
        this.f54293a = i7;
        this.f54294b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i7 = this.f54293a;
        Object obj = this.f54294b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = i5.c.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f24226q;
                i5.c.t(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f24221n) - org.telegram.messenger.g0.f24220m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.s2.f26829a) {
                        i5.c.t(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                v71 v71Var = (v71) obj;
                v71Var.R = SystemClock.elapsedRealtime() + 1500;
                v71Var.m0.invalidate();
                return;
        }
    }
}
