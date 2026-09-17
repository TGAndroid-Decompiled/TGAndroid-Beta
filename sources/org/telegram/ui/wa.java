package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f41863a;
    public final Object f41864b;

    public wa(Object obj, int i10) {
        this.f41863a = i10;
        this.f41864b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f41863a) {
            case 0:
            case 1:
            default:
                aVar.f2648a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f41863a) {
            case 0:
                ((rb) this.f41864b).Z(canvas, rectF);
                return;
            case 1:
                bq0 bq0Var = (bq0) this.f41864b;
                j0 j0Var = bq0Var.d;
                mp0 mp0Var = bq0Var.h.f41602b;
                hh.d.b(mp0Var, canvas, rectF, mp0Var, j0Var);
                mp0 mp0Var2 = bq0Var.f34874n.f41602b;
                hh.d.b(mp0Var2, canvas, rectF, mp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41864b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.f33771a;
                hh.d.b(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.f33777d0);
                return;
        }
    }
}
