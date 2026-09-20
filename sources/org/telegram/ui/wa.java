package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements bh.a {
    public final int f38762a;
    public final Object f38763b;

    public wa(Object obj, int i10) {
        this.f38762a = i10;
        this.f38763b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38762a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38762a) {
            case 0:
                ((sb) this.f38763b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f38763b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f39194b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.f32823n.f39194b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38763b;
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.f31439a;
                gh.d.a(vl0Var, canvas, rectF, vl0Var, premiumPreviewFragment.f31445d0);
                return;
        }
    }
}
