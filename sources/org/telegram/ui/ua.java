package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ua implements og.a {
    public final int f38891a;
    public final Object f38892b;

    public ua(Object obj, int i10) {
        this.f38891a = i10;
        this.f38892b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f38891a) {
            case 0:
                ((pb) this.f38892b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38892b;
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.f31951a;
                tg.c.b(sl0Var, canvas, rectF, sl0Var, premiumPreviewFragment.f31952a0);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f38891a) {
            case 0:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
