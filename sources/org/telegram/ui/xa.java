package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements dh.a {
    public final int f45707a;
    public final Object f45708b;

    public xa(Object obj, int i10) {
        this.f45707a = i10;
        this.f45708b = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f45707a) {
            case 0:
            default:
                aVar.f6296a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f45707a) {
            case 0:
                ((tb) this.f45708b).X(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45708b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f35862a;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.f35868d0);
                return;
        }
    }
}
