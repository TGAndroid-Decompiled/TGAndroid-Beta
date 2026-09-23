package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38334a;
    public final Object f38335b;

    public va(Object obj, int i10) {
        this.f38334a = i10;
        this.f38335b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38334a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38334a) {
            case 0:
                ((rb) this.f38335b).Z(canvas, rectF);
                return;
            case 1:
                up0 up0Var = (up0) this.f38335b;
                k0 k0Var = up0Var.d;
                fp0 fp0Var = up0Var.h.f35921b;
                gh.d.a(fp0Var, canvas, rectF, fp0Var, k0Var);
                fp0 fp0Var2 = up0Var.f38158n.f35921b;
                gh.d.a(fp0Var2, canvas, rectF, fp0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38335b;
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.f31126a;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, premiumPreviewFragment.f31132d0);
                return;
        }
    }
}
