package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements bh.a {
    public final int f38752a;
    public final Object f38753b;

    public wa(Object obj, int i10) {
        this.f38752a = i10;
        this.f38753b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38752a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38752a) {
            case 0:
                ((sb) this.f38753b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f38753b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f39204b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.f32751n.f39204b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38753b;
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.f31399a;
                gh.d.a(wl0Var, canvas, rectF, wl0Var, premiumPreviewFragment.f31405d0);
                return;
        }
    }
}
