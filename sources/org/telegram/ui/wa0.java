package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class wa0 implements q1.d {
    public final int f50759a;
    public final Object f50760b;

    public wa0(Object obj, int i3) {
        this.f50759a = i3;
        this.f50760b = obj;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        int i3 = this.f50759a;
        int i10 = 0;
        Object obj = this.f50760b;
        switch (i3) {
            case 0:
                md0 md0Var = ((xd0) obj).f51951c0;
                if (md0Var != null) {
                    int i11 = md0.G;
                    View view = md0Var.f47655c;
                    ViewGroup viewGroup = md0Var.f47654b;
                    PointF pointF = md0Var.E;
                    kh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l00 l00Var = md0Var.h;
                    l00Var.setTranslationX(pointF.x);
                    l00Var.setTranslationY(pointF.y);
                    md0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                zk0 zk0Var = (zk0) obj;
                float f12 = f10 / 100.0f;
                zk0Var.f52694b = f12;
                TextView textView = zk0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                zk0Var.invalidate();
                return;
            case 2:
                zp0 zp0Var = (zp0) obj;
                zp0Var.f52727d0 = f10;
                zp0Var.f52729f0 = f11;
                zp0Var.G();
                return;
            case 3:
                sq0 sq0Var = (sq0) obj;
                if (sq0Var.f49595e > sq0Var.f49596f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.o51 o51Var = sq0Var.f49599s.f41526r3;
                int measuredWidth = (int) (((sq0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = sq0Var.getMeasuredHeight();
                o51Var.h = measuredWidth;
                o51Var.f36725i = measuredHeight;
                View view2 = o51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                my0 my0Var = (my0) obj;
                my0Var.E = f10 / 1000.0f;
                my0Var.invalidate();
                return;
            default:
                cz0 cz0Var = (cz0) obj;
                org.telegram.ui.Components.o51 o51Var2 = cz0Var.f44503r.P;
                int measuredWidth2 = (int) (((cz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = cz0Var.getMeasuredHeight();
                o51Var2.h = measuredWidth2;
                o51Var2.f36725i = measuredHeight2;
                View view3 = o51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
