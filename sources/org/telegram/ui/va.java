package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38454a;
    public final Object f38455b;

    public va(Object obj, int i10) {
        this.f38454a = i10;
        this.f38455b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38454a) {
            case 0:
            case 1:
            default:
                aVar.f415a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38454a) {
            case 0:
                ((rb) this.f38455b).Z(canvas, rectF);
                return;
            case 1:
                aq0 aq0Var = (aq0) this.f38455b;
                j0 j0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.f38066b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, j0Var);
                lp0 lp0Var2 = aq0Var.f31900n.f38066b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38455b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f31154a;
                gh.d.a(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.f31160d0);
                return;
        }
    }
}
