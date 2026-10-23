package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f42983a;
    public final Object f42984b;

    public wa(Object obj, int i10) {
        this.f42983a = i10;
        this.f42984b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f42983a) {
            case 0:
            case 1:
            default:
                aVar.f4360a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42983a) {
            case 0:
                ((sb) this.f42984b).Y(canvas, rectF);
                return;
            case 1:
                lp0 lp0Var = (lp0) this.f42984b;
                l0 l0Var = lp0Var.d;
                wo0 wo0Var = lp0Var.h.f37385b;
                hh.d.a(wo0Var, canvas, rectF, wo0Var, l0Var);
                wo0 wo0Var2 = lp0Var.f39305n.f37385b;
                hh.d.a(wo0Var2, canvas, rectF, wo0Var2, l0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42984b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f33799a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.f33805d0);
                return;
        }
    }
}
