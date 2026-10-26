package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements dh.a {
    public final int f45710a;
    public final Object f45711b;

    public xa(Object obj, int i10) {
        this.f45710a = i10;
        this.f45711b = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f45710a) {
            case 0:
            default:
                aVar.f6296a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f45710a) {
            case 0:
                ((tb) this.f45711b).X(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45711b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f35865a;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.f35871d0);
                return;
        }
    }
}
