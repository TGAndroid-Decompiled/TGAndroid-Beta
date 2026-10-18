package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ya implements ch.a {
    public final int f43396a;
    public final Object f43397b;

    public ya(Object obj, int i10) {
        this.f43396a = i10;
        this.f43397b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f43396a) {
            case 0:
            case 1:
            default:
                aVar.f4357a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f43396a) {
            case 0:
                ((ub) this.f43397b).Z(canvas, rectF);
                return;
            case 1:
                kp0 kp0Var = (kp0) this.f43397b;
                m0 m0Var = kp0Var.d;
                vo0 vo0Var = kp0Var.h.f36582b;
                hh.d.a(vo0Var, canvas, rectF, vo0Var, m0Var);
                vo0 vo0Var2 = kp0Var.f38653n.f36582b;
                hh.d.a(vo0Var2, canvas, rectF, vo0Var2, m0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f43397b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.f33492a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.f33498d0);
                return;
        }
    }
}
