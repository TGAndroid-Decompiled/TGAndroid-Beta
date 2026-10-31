package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
public final class z80 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f44049a;
    public final Object f44050b;

    public z80(Object obj, int i10) {
        this.f44049a = i10;
        this.f44050b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f44049a;
        Object obj = this.f44050b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder l4 = i0.a.l(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.i0.f16026q;
                i0.a.p(point.y, l4);
                int i11 = (measuredHeight - org.telegram.messenger.i0.f16021n) - org.telegram.messenger.i0.f16020m;
                if (i11 > org.telegram.messenger.i0.L(100.0f) && i11 < point.y && org.telegram.messenger.i0.L(100.0f) + i11 > point.y) {
                    point.y = i11;
                    if (org.telegram.messenger.v2.f18448a) {
                        i0.a.p(point.y, new StringBuilder("fix display size y to "));
                        return;
                    }
                    return;
                }
                return;
            default:
                m91 m91Var = (m91) obj;
                m91Var.Q = SystemClock.elapsedRealtime() + 1500;
                m91Var.f39573l0.invalidate();
                return;
        }
    }
}
