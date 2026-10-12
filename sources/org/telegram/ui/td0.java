package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements o1.g {
    public final int f42166a;
    public final Object f42167b;

    public td0(Object obj, int i10) {
        this.f42166a = i10;
        this.f42167b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f42166a;
        int i11 = 0;
        Object obj = this.f42167b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((xg0) obj).f43935b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f39482c;
                    ViewGroup viewGroup = kg0Var.f39481b;
                    PointF pointF = kg0Var.f39490y;
                    hh.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.s20 s20Var = kg0Var.h;
                    s20Var.setTranslationX(pointF.x);
                    s20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) obj;
                float f11 = f7 / 100.0f;
                to0Var.f42258b = f11;
                TextView textView = to0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                to0Var.invalidate();
                return;
            case 2:
                ru0 ru0Var = (ru0) obj;
                ru0Var.f41722c0 = f7;
                ru0Var.f41724e0 = f10;
                ru0Var.G();
                return;
            case 3:
                nv0 nv0Var = (nv0) obj;
                if (nv0Var.f40487e > nv0Var.f40488f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.s81 s81Var = nv0Var.f40491s.f33847q3;
                int measuredWidth = (int) (((nv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = nv0Var.getMeasuredHeight();
                s81Var.h = measuredWidth;
                s81Var.f30485i = measuredHeight;
                View view2 = s81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                n41 n41Var = (n41) obj;
                n41Var.f40211y = f7 / 1000.0f;
                n41Var.invalidate();
                return;
            default:
                h51 h51Var = (h51) obj;
                org.telegram.ui.Components.s81 s81Var2 = h51Var.f38254r.Q;
                int measuredWidth2 = (int) (((h51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = h51Var.getMeasuredHeight();
                s81Var2.h = measuredWidth2;
                s81Var2.f30485i = measuredHeight2;
                View view3 = s81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
