package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ua implements pg.a {
    public final int f41785a;
    public final Object f41786b;

    public ua(Object obj, int i10) {
        this.f41785a = i10;
        this.f41786b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f41785a) {
            case 0:
                ((pb) this.f41786b).Z(canvas, rectF);
                return;
            case 1:
                np0 np0Var = (np0) this.f41786b;
                l0 l0Var = np0Var.d;
                yo0 yo0Var = np0Var.h.f37443b;
                ug.c.b(yo0Var, canvas, rectF, yo0Var, l0Var);
                yo0 yo0Var2 = np0Var.f39435n.f37443b;
                ug.c.b(yo0Var2, canvas, rectF, yo0Var2, l0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41786b;
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.f34480a;
                ug.c.b(sl0Var, canvas, rectF, sl0Var, premiumPreviewFragment.f34481a0);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f41785a) {
            case 0:
            case 1:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
