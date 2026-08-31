package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ua implements pg.a {
    public final int f41869a;
    public final Object f41870b;

    public ua(Object obj, int i10) {
        this.f41869a = i10;
        this.f41870b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f41869a) {
            case 0:
                ((pb) this.f41870b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41870b;
                org.telegram.ui.Components.tl0 tl0Var = premiumPreviewFragment.f34480a;
                ug.c.b(tl0Var, canvas, rectF, tl0Var, premiumPreviewFragment.f34481a0);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f41869a) {
            case 0:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
