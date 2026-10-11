package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f42972a;
    public final Object f42973b;

    public va(Object obj, int i10) {
        this.f42972a = i10;
        this.f42973b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42972a) {
            case 0:
            case 1:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42972a) {
            case 0:
                ((rb) this.f42973b).Z(canvas, rectF);
                return;
            case 1:
                zp0 zp0Var = (zp0) this.f42973b;
                j0 j0Var = zp0Var.d;
                kp0 kp0Var = zp0Var.h.f42257b;
                gh.d.a(kp0Var, canvas, rectF, kp0Var, j0Var);
                kp0 kp0Var2 = zp0Var.f45086n.f42257b;
                gh.d.a(kp0Var2, canvas, rectF, kp0Var2, j0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42973b;
                org.telegram.ui.Components.rm0 rm0Var = premiumPreviewFragment.f34187a;
                gh.d.a(rm0Var, canvas, rectF, rm0Var, premiumPreviewFragment.f34193d0);
                return;
        }
    }
}
