package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f41890a;
    public final Object f41891b;

    public wa(Object obj, int i10) {
        this.f41890a = i10;
        this.f41891b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f41890a) {
            case 0:
            case 1:
            default:
                aVar.f2675a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f41890a) {
            case 0:
                ((rb) this.f41891b).Z(canvas, rectF);
                return;
            case 1:
                bq0 bq0Var = (bq0) this.f41891b;
                j0 j0Var = bq0Var.d;
                mp0 mp0Var = bq0Var.h.f41629b;
                hh.d.b(mp0Var, canvas, rectF, mp0Var, j0Var);
                mp0 mp0Var2 = bq0Var.f34901n.f41629b;
                hh.d.b(mp0Var2, canvas, rectF, mp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41891b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f33798a;
                hh.d.b(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.f33804d0);
                return;
        }
    }
}
