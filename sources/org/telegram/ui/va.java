package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38761a;
    public final Object f38762b;

    public va(Object obj, int i10) {
        this.f38761a = i10;
        this.f38762b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38761a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38761a) {
            case 0:
                ((rb) this.f38762b).Z(canvas, rectF);
                return;
            case 1:
                sp0 sp0Var = (sp0) this.f38762b;
                k0 k0Var = sp0Var.d;
                dp0 dp0Var = sp0Var.h.f35734b;
                gh.d.a(dp0Var, canvas, rectF, dp0Var, k0Var);
                dp0 dp0Var2 = sp0Var.f37950n.f35734b;
                gh.d.a(dp0Var2, canvas, rectF, dp0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38762b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f31515a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.f31521d0);
                return;
        }
    }
}
