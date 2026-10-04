package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class xa implements bh.a {
    public final int f42810a;
    public final Object f42811b;

    public xa(Object obj, int i10) {
        this.f42810a = i10;
        this.f42811b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f42810a) {
            case 0:
            case 1:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f42810a) {
            case 0:
                ((tb) this.f42811b).Z(canvas, rectF);
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42811b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f34115a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.f34121d0);
                return;
            default:
                a91 a91Var = (a91) this.f42811b;
                org.telegram.ui.Components.c71 c71Var = a91Var.f34738c;
                gh.d.a(c71Var, canvas, rectF, c71Var, a91Var.f34737b);
                return;
        }
    }
}
