package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class v91 implements bh.a {
    public final RectF f38451a = new RectF();
    public final w8 f38452b;
    public final ya1 f38453c;

    public v91(ya1 ya1Var, w8 w8Var) {
        this.f38453c = ya1Var;
        this.f38452b = w8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f415a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        cc ccVar;
        cc ccVar2;
        ya1 ya1Var = this.f38453c;
        ya1Var.fragmentView.getMeasuredWidth();
        ya1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ya1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = ya1Var.T;
                ccVar = ya1Var.S;
            } else if (i10 == 1 && (ccVar2 = ya1Var.f39808j0) != null) {
                nVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                je jeVar = ya1Var.f39809k0;
                if (jeVar != null) {
                    nVar = jeVar.f34861b1;
                    ccVar = jeVar;
                } else {
                    nVar = null;
                    ccVar = null;
                }
            }
            if (nVar != null && ccVar != null) {
                w8 w8Var = this.f38452b;
                RectF rectF2 = this.f38451a;
                hh.k.c(ccVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ya1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
