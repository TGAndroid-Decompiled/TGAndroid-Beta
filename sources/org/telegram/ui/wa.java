package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements bh.a {
    public final int f43149a;
    public final Object f43150b;

    public wa(Object obj, int i10) {
        this.f43149a = i10;
        this.f43150b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f43149a) {
            case 0:
            case 1:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f43149a) {
            case 0:
                ((sb) this.f43150b).Z(canvas, rectF);
                return;
            case 1:
                aq0 aq0Var = (aq0) this.f43150b;
                k0 k0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.f42514b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, k0Var);
                lp0 lp0Var2 = aq0Var.f35995n.f42514b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f43150b;
                org.telegram.ui.Components.qm0 qm0Var = premiumPreviewFragment.f34125a;
                gh.d.a(qm0Var, canvas, rectF, qm0Var, premiumPreviewFragment.f34131d0);
                return;
        }
    }
}
