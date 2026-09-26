package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class va implements bh.a {
    public final int f38672a;
    public final Object f38673b;

    public va(Object obj, int i10) {
        this.f38672a = i10;
        this.f38673b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f38672a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f38672a) {
            case 0:
                ((rb) this.f38673b).Z(canvas, rectF);
                return;
            case 1:
                tp0 tp0Var = (tp0) this.f38673b;
                k0 k0Var = tp0Var.d;
                ep0 ep0Var = tp0Var.h.f35938b;
                gh.d.a(ep0Var, canvas, rectF, ep0Var, k0Var);
                ep0 ep0Var2 = tp0Var.f38179n.f35938b;
                gh.d.a(ep0Var2, canvas, rectF, ep0Var2, k0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38673b;
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.f31441a;
                gh.d.a(wl0Var, canvas, rectF, wl0Var, premiumPreviewFragment.f31447d0);
                return;
        }
    }
}
