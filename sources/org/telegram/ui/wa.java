package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class wa implements ch.a {
    public final int f42515a;
    public final Object f42516b;

    public wa(Object obj, int i10) {
        this.f42515a = i10;
        this.f42516b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f42515a) {
            case 0:
            case 1:
            default:
                aVar.f4355a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42515a) {
            case 0:
                ((sb) this.f42516b).Z(canvas, rectF);
                return;
            case 1:
                ip0 ip0Var = (ip0) this.f42516b;
                m0 m0Var = ip0Var.d;
                to0 to0Var = ip0Var.h.f36042b;
                hh.d.a(to0Var, canvas, rectF, to0Var, m0Var);
                to0 to0Var2 = ip0Var.f38086n.f36042b;
                hh.d.a(to0Var2, canvas, rectF, to0Var2, m0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42516b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.f33491a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.f33497d0);
                return;
        }
    }
}
