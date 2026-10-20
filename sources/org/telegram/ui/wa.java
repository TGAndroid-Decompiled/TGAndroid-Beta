package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f42522a;
    public final Object f42523b;

    public wa(Object obj, int i10) {
        this.f42522a = i10;
        this.f42523b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f42522a) {
            case 0:
            case 1:
            default:
                aVar.f4353a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42522a) {
            case 0:
                ((sb) this.f42523b).Z(canvas, rectF);
                return;
            case 1:
                ip0 ip0Var = (ip0) this.f42523b;
                m0 m0Var = ip0Var.d;
                to0 to0Var = ip0Var.h.f36020b;
                hh.d.a(to0Var, canvas, rectF, to0Var, m0Var);
                to0 to0Var2 = ip0Var.f38094n.f36020b;
                hh.d.a(to0Var2, canvas, rectF, to0Var2, m0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42523b;
                org.telegram.ui.Components.jm0 jm0Var = premiumPreviewFragment.f33497a;
                hh.d.a(jm0Var, canvas, rectF, jm0Var, premiumPreviewFragment.f33503d0);
                return;
        }
    }
}
