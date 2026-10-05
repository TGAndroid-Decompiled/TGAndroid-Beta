package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f42870a;
    public final Object f42871b;

    public xa(Object obj, int i10) {
        this.f42870a = i10;
        this.f42871b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42870a) {
            case 0:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42870a) {
            case 0:
                ((tb) this.f42871b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42871b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f34135a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.f34141d0);
                return;
        }
    }
}
