package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f39477a;
    public final Object f39478b;

    public xa(Object obj, int i10) {
        this.f39477a = i10;
        this.f39478b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f39477a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f39477a) {
            case 0:
                ((tb) this.f39478b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f39478b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f39135b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.f32866n.f39135b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f39478b;
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.f31172a;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, premiumPreviewFragment.f31178d0);
                return;
        }
    }
}
