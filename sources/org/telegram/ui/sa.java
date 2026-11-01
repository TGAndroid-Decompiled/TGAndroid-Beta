package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class sa implements ug.a {
    public final int f41295a;
    public final Object f41296b;

    public sa(Object obj, int i10) {
        this.f41295a = i10;
        this.f41296b = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i10 = this.f41295a;
        Object obj = this.f41296b;
        switch (i10) {
            case 0:
                ((qb) obj).X(canvas, rectF);
                return;
            case 1:
                xb0.a0((xb0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.uk0 uk0Var = premiumPreviewFragment.f33696a;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, premiumPreviewFragment.f33702d0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.S6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                jy0 jy0Var = ((ProfileActivity) obj).f33796c1;
                jy0Var.O = true;
                jy0Var.draw(canvas);
                jy0Var.O = false;
                return;
            default:
                org.telegram.ui.Components.uk0 uk0Var2 = (org.telegram.ui.Components.uk0) obj;
                org.telegram.ui.Components.l9 l9Var = uk0Var2.R2;
                if (l9Var != null) {
                    l9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.fk0 fk0Var = uk0Var2.G2;
                if (fk0Var != null) {
                    fk0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f41295a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                yVar.f7259b = true;
                return;
        }
    }
}
