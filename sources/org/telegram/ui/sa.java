package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class sa implements ug.a {
    public final int f41423a;
    public final Object f41424b;

    public sa(Object obj, int i10) {
        this.f41423a = i10;
        this.f41424b = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i10 = this.f41423a;
        Object obj = this.f41424b;
        switch (i10) {
            case 0:
                ((qb) obj).X(canvas, rectF);
                return;
            case 1:
                yb0.Z((yb0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.tk0 tk0Var = premiumPreviewFragment.f33689a;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, premiumPreviewFragment.f33695d0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.R6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                ky0 ky0Var = ((ProfileActivity) obj).f33789c1;
                ky0Var.O = true;
                ky0Var.draw(canvas);
                ky0Var.O = false;
                return;
            default:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) obj;
                org.telegram.ui.Components.l9 l9Var = tk0Var2.R2;
                if (l9Var != null) {
                    l9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.ek0 ek0Var = tk0Var2.G2;
                if (ek0Var != null) {
                    ek0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f41423a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                yVar.f7258b = true;
                return;
        }
    }
}
