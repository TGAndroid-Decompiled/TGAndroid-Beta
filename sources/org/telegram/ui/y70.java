package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class y70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f52160a;
    public final Object f52161b;

    public y70(Object obj, int i7) {
        this.f52160a = i7;
        this.f52161b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i7 = this.f52160a;
        Object obj = this.f52161b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder n10 = jg.g.n(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f22544q;
                jg.g.s(point.y, n10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f22539n) - org.telegram.messenger.g0.f22538m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.f25199a) {
                        jg.g.s(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) obj;
                u71Var.Q = SystemClock.elapsedRealtime() + 1500;
                u71Var.f50302l0.invalidate();
                return;
        }
    }
}
