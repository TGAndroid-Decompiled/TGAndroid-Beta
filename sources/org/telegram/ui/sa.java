package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

public final class sa implements kg.a {

    public final int f42561a;

    public final Object f42562b;

    public sa(Object obj, int i10) {
        this.f42561a = i10;
        this.f42562b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f42561a) {
            case 0:
                ((nb) this.f42562b).Z(canvas, rectF);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f42562b;
                org.telegram.ui.Components.zk0 zk0Var = premiumPreviewFragment.f35842a;
                pg.c.b(zk0Var, canvas, rectF, zk0Var, premiumPreviewFragment.Z);
                break;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f42561a) {
        }
        yVar.f6327b = true;
    }
}
