package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements bh.a {
    public final int f38783a;
    public final Object f38784b;

    public wa(Object obj, int i10) {
        this.f38783a = i10;
        this.f38784b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38783a) {
            case 0:
            case 1:
            default:
                aVar.f414a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38783a) {
            case 0:
                ((sb) this.f38784b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f38784b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f39218b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.f32844n.f39218b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38784b;
                org.telegram.ui.Components.yl0 yl0Var = premiumPreviewFragment.f31460a;
                gh.d.a(yl0Var, canvas, rectF, yl0Var, premiumPreviewFragment.f31466d0);
                return;
        }
    }
}
