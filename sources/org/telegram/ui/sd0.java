package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements o1.g {
    public final int f41673a;
    public final Object f41674b;

    public sd0(Object obj, int i10) {
        this.f41673a = i10;
        this.f41674b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f41673a;
        int i11 = 0;
        Object obj = this.f41674b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((wg0) obj).f43575b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f39279c;
                    ViewGroup viewGroup = kg0Var.f39278b;
                    PointF pointF = kg0Var.f39287y;
                    hh.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.p20 p20Var = kg0Var.h;
                    p20Var.setTranslationX(pointF.x);
                    p20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ro0 ro0Var = (ro0) obj;
                float f11 = f7 / 100.0f;
                ro0Var.f41464b = f11;
                TextView textView = ro0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ro0Var.invalidate();
                return;
            case 2:
                pu0 pu0Var = (pu0) obj;
                pu0Var.f40884c0 = f7;
                pu0Var.f40886e0 = f10;
                pu0Var.G();
                return;
            case 3:
                lv0 lv0Var = (lv0) obj;
                if (lv0Var.f39687e > lv0Var.f39688f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.m81 m81Var = lv0Var.f39691s.f34010q3;
                int measuredWidth = (int) (((lv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = lv0Var.getMeasuredHeight();
                m81Var.h = measuredWidth;
                m81Var.f28759i = measuredHeight;
                View view2 = m81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                l41 l41Var = (l41) obj;
                l41Var.f39433y = f7 / 1000.0f;
                l41Var.invalidate();
                return;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.m81 m81Var2 = e51Var.f37161r.Q;
                int measuredWidth2 = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = e51Var.getMeasuredHeight();
                m81Var2.h = measuredWidth2;
                m81Var2.f28759i = measuredHeight2;
                View view3 = m81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
