package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f42818a;
    public final Object f42819b;

    public xa(Object obj, int i10) {
        this.f42818a = i10;
        this.f42819b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42818a) {
            case 0:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42818a) {
            case 0:
                ((tb) this.f42819b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42819b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f34122a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.f34128d0);
                return;
        }
    }
}
