package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements o1.g {
    public final int f40035a;
    public final Object f40036b;

    public rd0(Object obj, int i10) {
        this.f40035a = i10;
        this.f40036b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f40035a;
        int i11 = 0;
        Object obj = this.f40036b;
        switch (i10) {
            case 0:
                ig0 ig0Var = ((ug0) obj).f41203b0;
                if (ig0Var != null) {
                    int i12 = ig0.E;
                    View view = ig0Var.f37425c;
                    ViewGroup viewGroup = ig0Var.f37424b;
                    PointF pointF = ig0Var.f37433y;
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
                oo0Var.f39257b = f11;
                TextView textView = oo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                oo0Var.invalidate();
                return;
            case 2:
                ju0 ju0Var = (ju0) obj;
                ju0Var.f37761c0 = f7;
                ju0Var.f37763e0 = f10;
                ju0Var.G();
                return;
            case 3:
                fv0 fv0Var = (fv0) obj;
                if (fv0Var.f36414e > fv0Var.f36415f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.f81 f81Var = fv0Var.f36418s.f34007q3;
                int measuredWidth = (int) (((fv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = fv0Var.getMeasuredHeight();
                f81Var.h = measuredWidth;
                f81Var.f26375i = measuredHeight;
                View view2 = f81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                f41 f41Var = (f41) obj;
                f41Var.f36193y = f7 / 1000.0f;
                f41Var.invalidate();
                return;
            default:
                y41 y41Var = (y41) obj;
                org.telegram.ui.Components.f81 f81Var2 = y41Var.f43068r.Q;
                int measuredWidth2 = (int) (((y41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = y41Var.getMeasuredHeight();
                f81Var2.h = measuredWidth2;
                f81Var2.f26375i = measuredHeight2;
                View view3 = f81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
