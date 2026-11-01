package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
public final class y80 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f43605a;
    public final Object f43606b;

    public y80(Object obj, int i10) {
        this.f43605a = i10;
        this.f43606b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f43605a;
        Object obj = this.f43606b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder l4 = i0.a.l(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.i0.f16172q;
                i0.a.p(point.y, l4);
                int i11 = (measuredHeight - org.telegram.messenger.i0.f16167n) - org.telegram.messenger.i0.f16166m;
                if (i11 > org.telegram.messenger.i0.L(100.0f) && i11 < point.y && org.telegram.messenger.i0.L(100.0f) + i11 > point.y) {
                    point.y = i11;
                    if (org.telegram.messenger.v2.f18578a) {
                        i0.a.p(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                k91 k91Var = (k91) obj;
                k91Var.Q = SystemClock.elapsedRealtime() + 1500;
                k91Var.f38748l0.invalidate();
                return;
        }
    }
}
