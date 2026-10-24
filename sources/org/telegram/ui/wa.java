package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f42970a;
    public final Object f42971b;

    public wa(Object obj, int i10) {
        this.f42970a = i10;
        this.f42971b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f42970a) {
            case 0:
            case 1:
            default:
                aVar.f4360a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42970a) {
            case 0:
                ((sb) this.f42971b).Y(canvas, rectF);
                return;
            case 1:
                kp0 kp0Var = (kp0) this.f42971b;
                l0 l0Var = kp0Var.d;
                vo0 vo0Var = kp0Var.h.f36966b;
                hh.d.a(vo0Var, canvas, rectF, vo0Var, l0Var);
                vo0 vo0Var2 = kp0Var.f39013n.f36966b;
                hh.d.a(vo0Var2, canvas, rectF, vo0Var2, l0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42971b;
                org.telegram.ui.Components.lm0 lm0Var = premiumPreviewFragment.f33801a;
                hh.d.a(lm0Var, canvas, rectF, lm0Var, premiumPreviewFragment.f33807d0);
                return;
        }
    }
}
