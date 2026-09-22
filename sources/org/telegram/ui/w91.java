package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class w91 implements bh.a {
    public final RectF f38755a = new RectF();
    public final w8 f38756b;
    public final za1 f38757c;

    public w91(za1 za1Var, w8 w8Var) {
        this.f38757c = za1Var;
        this.f38756b = w8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        cc ccVar;
        cc ccVar2;
        za1 za1Var = this.f38757c;
        za1Var.fragmentView.getMeasuredWidth();
        za1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(za1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = za1Var.T;
                ccVar = za1Var.S;
            } else if (i10 == 1 && (ccVar2 = za1Var.f40121j0) != null) {
                nVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                je jeVar = za1Var.f40122k0;
                if (jeVar != null) {
                    nVar = jeVar.f34871b1;
                    ccVar = jeVar;
                } else {
                    nVar = null;
                    ccVar = null;
                }
            }
            if (nVar != null && ccVar != null) {
                w8 w8Var = this.f38756b;
                RectF rectF2 = this.f38755a;
                hh.k.c(ccVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    za1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
