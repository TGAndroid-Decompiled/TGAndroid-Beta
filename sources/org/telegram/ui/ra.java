package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ra implements jg.a {
    public final int f42336a;
    public final Object f42337b;

    public ra(Object obj, int i9) {
        this.f42336a = i9;
        this.f42337b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f42336a) {
            case 0:
                ((mb) this.f42337b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42337b;
                org.telegram.ui.Components.wk0 wk0Var = premiumPreviewFragment.f35839a;
                og.d.b(wk0Var, canvas, rectF, wk0Var, premiumPreviewFragment.Z);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f42336a) {
            case 0:
            default:
                xVar.f7046b = true;
                return;
        }
    }
}
