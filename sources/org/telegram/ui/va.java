package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f42938a;
    public final Object f42939b;

    public va(Object obj, int i10) {
        this.f42938a = i10;
        this.f42939b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42938a) {
            case 0:
            case 1:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42938a) {
            case 0:
                ((rb) this.f42939b).Z(canvas, rectF);
                return;
            case 1:
                zp0 zp0Var = (zp0) this.f42939b;
                j0 j0Var = zp0Var.d;
                kp0 kp0Var = zp0Var.h.f42223b;
                gh.d.a(kp0Var, canvas, rectF, kp0Var, j0Var);
                kp0 kp0Var2 = zp0Var.f45052n.f42223b;
                gh.d.a(kp0Var2, canvas, rectF, kp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42939b;
                org.telegram.ui.Components.sm0 sm0Var = premiumPreviewFragment.f34153a;
                gh.d.a(sm0Var, canvas, rectF, sm0Var, premiumPreviewFragment.f34159d0);
                return;
        }
    }
}
