package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements o1.g {
    public final int f41452a;
    public final Object f41453b;

    public rd0(Object obj, int i10) {
        this.f41452a = i10;
        this.f41453b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f41452a;
        int i11 = 0;
        Object obj = this.f41453b;
        switch (i10) {
            case 0:
                jg0 jg0Var = ((vg0) obj).f43048b0;
                if (jg0Var != null) {
                    int i12 = jg0.E;
                    View view = jg0Var.f39077c;
                    ViewGroup viewGroup = jg0Var.f39076b;
                    PointF pointF = jg0Var.f39085y;
                    hh.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.q20 q20Var = jg0Var.h;
                    q20Var.setTranslationX(pointF.x);
                    q20Var.setTranslationY(pointF.y);
                    jg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                qo0 qo0Var = (qo0) obj;
                float f11 = f7 / 100.0f;
                qo0Var.f41246b = f11;
                TextView textView = qo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                qo0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f40647c0 = f7;
                ou0Var.f40649e0 = f10;
                ou0Var.G();
                return;
            case 3:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.f39464e > kv0Var.f39465f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.n81 n81Var = kv0Var.f39468s.f34072q3;
                int measuredWidth = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = kv0Var.getMeasuredHeight();
                n81Var.h = measuredWidth;
                n81Var.f29102i = measuredHeight;
                View view2 = n81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                k41 k41Var = (k41) obj;
                k41Var.f39236y = f7 / 1000.0f;
                k41Var.invalidate();
                return;
            default:
                d51 d51Var = (d51) obj;
                org.telegram.ui.Components.n81 n81Var2 = d51Var.f36942r.Q;
                int measuredWidth2 = (int) (((d51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = d51Var.getMeasuredHeight();
                n81Var2.h = measuredWidth2;
                n81Var2.f29102i = measuredHeight2;
                View view3 = n81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
