package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
public final class x70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f53119a;
    public final Object f53120b;

    public x70(Object obj, int i7) {
        this.f53119a = i7;
        this.f53120b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i7 = this.f53119a;
        Object obj = this.f53120b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = i5.c.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.f23609q;
                i5.c.r(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.f23604n) - org.telegram.messenger.g0.f23603m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.f26198a) {
                        i5.c.r(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                t71 t71Var = (t71) obj;
                t71Var.R = SystemClock.elapsedRealtime() + 1500;
                t71Var.m0.invalidate();
                return;
        }
    }
}
