package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements o1.g {
    public final int f40072a;
    public final Object f40073b;

    public rd0(Object obj, int i10) {
        this.f40072a = i10;
        this.f40073b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f40072a;
        int i11 = 0;
        Object obj = this.f40073b;
        switch (i10) {
            case 0:
                ig0 ig0Var = ((ug0) obj).f41239b0;
                if (ig0Var != null) {
                    int i12 = ig0.E;
                    View view = ig0Var.f37412c;
                    ViewGroup viewGroup = ig0Var.f37411b;
                    PointF pointF = ig0Var.f37420y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.c20 c20Var = ig0Var.h;
                    c20Var.setTranslationX(pointF.x);
                    c20Var.setTranslationY(pointF.y);
                    ig0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                oo0 oo0Var = (oo0) obj;
                float f11 = f7 / 100.0f;
                oo0Var.f39267b = f11;
                TextView textView = oo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                oo0Var.invalidate();
                return;
            case 2:
                ju0 ju0Var = (ju0) obj;
                ju0Var.f37769c0 = f7;
                ju0Var.f37771e0 = f10;
                ju0Var.G();
                return;
            case 3:
                fv0 fv0Var = (fv0) obj;
                if (fv0Var.f36422e > fv0Var.f36423f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.g81 g81Var = fv0Var.f36426s.f34020q3;
                int measuredWidth = (int) (((fv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = fv0Var.getMeasuredHeight();
                g81Var.h = measuredWidth;
                g81Var.f26737i = measuredHeight;
                View view2 = g81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                d41 d41Var = (d41) obj;
                d41Var.f35648y = f7 / 1000.0f;
                d41Var.invalidate();
                return;
            default:
                w41 w41Var = (w41) obj;
                org.telegram.ui.Components.g81 g81Var2 = w41Var.f41920r.Q;
                int measuredWidth2 = (int) (((w41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = w41Var.getMeasuredHeight();
                g81Var2.h = measuredWidth2;
                g81Var2.f26737i = measuredHeight2;
                View view3 = g81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
