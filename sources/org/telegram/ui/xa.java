package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f42811a;
    public final Object f42812b;

    public xa(Object obj, int i10) {
        this.f42811a = i10;
        this.f42812b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42811a) {
            case 0:
            case 1:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42811a) {
            case 0:
                ((tb) this.f42812b).Z(canvas, rectF);
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42812b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f34116a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.f34122d0);
                return;
            default:
                a91 a91Var = (a91) this.f42812b;
                org.telegram.ui.Components.c71 c71Var = a91Var.f34739c;
                gh.d.a(c71Var, canvas, rectF, c71Var, a91Var.f34738b);
                return;
        }
    }
}
