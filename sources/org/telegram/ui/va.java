package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38455a;
    public final Object f38456b;

    public va(Object obj, int i10) {
        this.f38455a = i10;
        this.f38456b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38455a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38455a) {
            case 0:
                ((rb) this.f38456b).Z(canvas, rectF);
                return;
            case 1:
                aq0 aq0Var = (aq0) this.f38456b;
                j0 j0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.f38080b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, j0Var);
                lp0 lp0Var2 = aq0Var.f31885n.f38080b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38456b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f31152a;
                gh.d.a(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.f31158d0);
                return;
        }
    }
}
