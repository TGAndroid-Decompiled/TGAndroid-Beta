package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ya implements ch.a {
    public final int f43372a;
    public final Object f43373b;

    public ya(Object obj, int i10) {
        this.f43372a = i10;
        this.f43373b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f43372a) {
            case 0:
            case 1:
            default:
                aVar.f4356a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f43372a) {
            case 0:
                ((ub) this.f43373b).Z(canvas, rectF);
                return;
            case 1:
                jp0 jp0Var = (jp0) this.f43373b;
                m0 m0Var = jp0Var.d;
                uo0 uo0Var = jp0Var.h.f36244b;
                hh.d.a(uo0Var, canvas, rectF, uo0Var, m0Var);
                uo0 uo0Var2 = jp0Var.f38254n.f36244b;
                hh.d.a(uo0Var2, canvas, rectF, uo0Var2, m0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f43373b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.f33485a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.f33491d0);
                return;
        }
    }
}
