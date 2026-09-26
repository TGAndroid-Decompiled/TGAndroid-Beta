package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38671a;
    public final Object f38672b;

    public va(Object obj, int i10) {
        this.f38671a = i10;
        this.f38672b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38671a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38671a) {
            case 0:
                ((rb) this.f38672b).Z(canvas, rectF);
                return;
            case 1:
                tp0 tp0Var = (tp0) this.f38672b;
                k0 k0Var = tp0Var.d;
                ep0 ep0Var = tp0Var.h.f35937b;
                gh.d.a(ep0Var, canvas, rectF, ep0Var, k0Var);
                ep0 ep0Var2 = tp0Var.f38178n.f35937b;
                gh.d.a(ep0Var2, canvas, rectF, ep0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38672b;
                org.telegram.ui.Components.xl0 xl0Var = premiumPreviewFragment.f31440a;
                gh.d.a(xl0Var, canvas, rectF, xl0Var, premiumPreviewFragment.f31446d0);
                return;
        }
    }
}
