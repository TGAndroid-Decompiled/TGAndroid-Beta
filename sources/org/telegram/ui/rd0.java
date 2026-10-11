package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements o1.g {
    public final int f41418a;
    public final Object f41419b;

    public rd0(Object obj, int i10) {
        this.f41418a = i10;
        this.f41419b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f41418a;
        int i11 = 0;
        Object obj = this.f41419b;
        switch (i10) {
            case 0:
                jg0 jg0Var = ((vg0) obj).f43014b0;
                if (jg0Var != null) {
                    int i12 = jg0.E;
                    View view = jg0Var.f39043c;
                    ViewGroup viewGroup = jg0Var.f39042b;
                    PointF pointF = jg0Var.f39051y;
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
                qo0Var.f41212b = f11;
                TextView textView = qo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                qo0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f40613c0 = f7;
                ou0Var.f40615e0 = f10;
                ou0Var.G();
                return;
            case 3:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.f39430e > kv0Var.f39431f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.o81 o81Var = kv0Var.f39434s.f34038q3;
                int measuredWidth = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = kv0Var.getMeasuredHeight();
                o81Var.h = measuredWidth;
                o81Var.f29321i = measuredHeight;
                View view2 = o81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                k41 k41Var = (k41) obj;
                k41Var.f39202y = f7 / 1000.0f;
                k41Var.invalidate();
                return;
            default:
                d51 d51Var = (d51) obj;
                org.telegram.ui.Components.o81 o81Var2 = d51Var.f36908r.Q;
                int measuredWidth2 = (int) (((d51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = d51Var.getMeasuredHeight();
                o81Var2.h = measuredWidth2;
                o81Var2.f29321i = measuredHeight2;
                View view3 = o81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
