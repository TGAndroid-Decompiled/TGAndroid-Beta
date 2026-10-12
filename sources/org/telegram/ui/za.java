package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class za implements bh.a {
    public final int f44679a;
    public final Object f44680b;

    public za(Object obj, int i10) {
        this.f44679a = i10;
        this.f44680b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f44679a) {
            case 0:
            case 1:
            default:
                aVar.f538a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f44679a) {
            case 0:
                ((vb) this.f44680b).Z(canvas, rectF);
                return;
            case 1:
                cq0 cq0Var = (cq0) this.f44680b;
                k0 k0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.f43579b;
                gh.d.a(np0Var, canvas, rectF, np0Var, k0Var);
                np0 np0Var2 = cq0Var.f36490n.f43579b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f44680b;
                org.telegram.ui.Components.wm0 wm0Var = premiumPreviewFragment.f33962a;
                gh.d.a(wm0Var, canvas, rectF, wm0Var, premiumPreviewFragment.f33968d0);
                return;
        }
    }
}
