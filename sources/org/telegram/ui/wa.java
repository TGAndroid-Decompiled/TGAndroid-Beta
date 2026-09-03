package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements og.a {
    public final int f39324a;
    public final Object f39325b;

    public wa(Object obj, int i10) {
        this.f39324a = i10;
        this.f39325b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f39324a) {
            case 0:
                ((rb) this.f39325b).Z(canvas, rectF);
                return;
            case 1:
                np0 np0Var = (np0) this.f39325b;
                n0 n0Var = np0Var.d;
                yo0 yo0Var = np0Var.h.f34720b;
                tg.c.b(yo0Var, canvas, rectF, yo0Var, n0Var);
                yo0 yo0Var2 = np0Var.f36565n.f34720b;
                tg.c.b(yo0Var2, canvas, rectF, yo0Var2, n0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f39325b;
                org.telegram.ui.Components.rl0 rl0Var = premiumPreviewFragment.f31925a;
                tg.c.b(rl0Var, canvas, rectF, rl0Var, premiumPreviewFragment.f31926a0);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f39324a) {
            case 0:
            case 1:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
