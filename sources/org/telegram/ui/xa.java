package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements ah.a {
    public final int f38650a;
    public final Object f38651b;

    public xa(Object obj, int i10) {
        this.f38650a = i10;
        this.f38651b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f38650a) {
            case 0:
                ((tb) this.f38651b).Z(canvas, rectF);
                return;
            case 1:
                bq0 bq0Var = (bq0) this.f38651b;
                k0 k0Var = bq0Var.d;
                lp0 lp0Var = bq0Var.h.f37307b;
                fh.d.b(lp0Var, canvas, rectF, lp0Var, k0Var);
                lp0 lp0Var2 = bq0Var.f31352n.f37307b;
                fh.d.b(lp0Var2, canvas, rectF, lp0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38651b;
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.f30267a;
                fh.d.b(vl0Var, canvas, rectF, vl0Var, premiumPreviewFragment.f30273d0);
                return;
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        switch (this.f38650a) {
            case 0:
            case 1:
            default:
                zVar.f8456b = true;
                return;
        }
    }
}
