package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class s70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f49409a;
    public final Object f49410b;

    public s70(Object obj, int i3) {
        this.f49409a = i3;
        this.f49410b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i3 = this.f49409a;
        Object obj = this.f49410b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = k2.p1.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f22608q;
                k2.p1.q(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f22603n) - org.telegram.messenger.g0.f22602m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.f25040a) {
                        k2.p1.q(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                l71 l71Var = (l71) obj;
                l71Var.R = SystemClock.elapsedRealtime() + 1500;
                l71Var.m0.invalidate();
                return;
        }
    }
}
