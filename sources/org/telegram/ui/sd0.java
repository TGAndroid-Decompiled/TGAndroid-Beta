package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements o1.g {
    public final int f41719a;
    public final Object f41720b;

    public sd0(Object obj, int i10) {
        this.f41719a = i10;
        this.f41720b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f41719a;
        int i11 = 0;
        Object obj = this.f41720b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((wg0) obj).f43621b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f39325c;
                    ViewGroup viewGroup = kg0Var.f39324b;
                    PointF pointF = kg0Var.f39333y;
                    hh.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.q20 q20Var = kg0Var.h;
                    q20Var.setTranslationX(pointF.x);
                    q20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ro0 ro0Var = (ro0) obj;
                float f11 = f7 / 100.0f;
                ro0Var.f41510b = f11;
                TextView textView = ro0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ro0Var.invalidate();
                return;
            case 2:
                pu0 pu0Var = (pu0) obj;
                pu0Var.f40930c0 = f7;
                pu0Var.f40932e0 = f10;
                pu0Var.G();
                return;
            case 3:
                lv0 lv0Var = (lv0) obj;
                if (lv0Var.f39733e > lv0Var.f39734f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.n81 n81Var = lv0Var.f39737s.f34048q3;
                int measuredWidth = (int) (((lv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = lv0Var.getMeasuredHeight();
                n81Var.h = measuredWidth;
                n81Var.f29052i = measuredHeight;
                View view2 = n81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                l41 l41Var = (l41) obj;
                l41Var.f39479y = f7 / 1000.0f;
                l41Var.invalidate();
                return;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.n81 n81Var2 = e51Var.f37207r.Q;
                int measuredWidth2 = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = e51Var.getMeasuredHeight();
                n81Var2.h = measuredWidth2;
                n81Var2.f29052i = measuredHeight2;
                View view3 = n81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
