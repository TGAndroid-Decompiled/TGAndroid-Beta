package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class y8 implements bh.a {
    public final int f40156a;
    public final Object f40157b;

    public y8(Object obj, int i10) {
        this.f40156a = i10;
        this.f40157b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f40156a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f40156a) {
            case 0:
                n9 n9Var = (n9) this.f40157b;
                org.telegram.ui.Components.t61 t61Var = n9Var.f35855c;
                gh.d.a(t61Var, canvas, rectF, t61Var, n9Var.h);
                return;
            case 1:
                ((tb) this.f40157b).Z(canvas, rectF);
                return;
            case 2:
                wp0 wp0Var = (wp0) this.f40157b;
                l0 l0Var = wp0Var.d;
                hp0 hp0Var = wp0Var.h.f36790b;
                gh.d.a(hp0Var, canvas, rectF, hp0Var, l0Var);
                hp0 hp0Var2 = wp0Var.f39403n.f36790b;
                gh.d.a(hp0Var2, canvas, rectF, hp0Var2, l0Var);
                return;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40157b;
                org.telegram.ui.Components.yl0 yl0Var = premiumPreviewFragment.f31443a;
                gh.d.a(yl0Var, canvas, rectF, yl0Var, premiumPreviewFragment.f31449d0);
                return;
            default:
                a91 a91Var = (a91) this.f40157b;
                org.telegram.ui.Components.t61 t61Var2 = a91Var.f32014c;
                gh.d.a(t61Var2, canvas, rectF, t61Var2, a91Var.f32012b);
                return;
        }
    }
}
