package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f39472a;
    public final Object f39473b;

    public xa(Object obj, int i10) {
        this.f39472a = i10;
        this.f39473b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f39472a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f39472a) {
            case 0:
                ((tb) this.f39473b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f39473b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f39130b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.f32862n.f39130b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f39473b;
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.f31168a;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, premiumPreviewFragment.f31174d0);
                return;
        }
    }
}
