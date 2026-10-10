package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements bh.a {
    public final int f43193a;
    public final Object f43194b;

    public wa(Object obj, int i10) {
        this.f43193a = i10;
        this.f43194b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f43193a) {
            case 0:
            case 1:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f43193a) {
            case 0:
                ((sb) this.f43194b).Z(canvas, rectF);
                return;
            case 1:
                aq0 aq0Var = (aq0) this.f43194b;
                k0 k0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.f42558b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, k0Var);
                lp0 lp0Var2 = aq0Var.f36039n.f42558b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f43194b;
                org.telegram.ui.Components.rm0 rm0Var = premiumPreviewFragment.f34163a;
                gh.d.a(rm0Var, canvas, rectF, rm0Var, premiumPreviewFragment.f34169d0);
                return;
        }
    }
}
