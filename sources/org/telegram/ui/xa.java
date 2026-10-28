package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements dh.a {
    public final int f45635a;
    public final Object f45636b;

    public xa(Object obj, int i10) {
        this.f45635a = i10;
        this.f45636b = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f45635a) {
            case 0:
            default:
                aVar.f6296a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f45635a) {
            case 0:
                ((tb) this.f45636b).X(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45636b;
                org.telegram.ui.Components.nm0 nm0Var = premiumPreviewFragment.f35889a;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, premiumPreviewFragment.f35895d0);
                return;
        }
    }
}
