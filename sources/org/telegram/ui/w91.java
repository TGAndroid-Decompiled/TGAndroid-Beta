package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class w91 implements bh.a {
    public final RectF f38749a = new RectF();
    public final x8 f38750b;
    public final za1 f38751c;

    public w91(za1 za1Var, x8 x8Var) {
        this.f38751c = za1Var;
        this.f38750b = x8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.o oVar;
        dc dcVar;
        dc dcVar2;
        za1 za1Var = this.f38751c;
        za1Var.fragmentView.getMeasuredWidth();
        za1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(za1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = za1Var.T;
                dcVar = za1Var.S;
            } else if (i10 == 1 && (dcVar2 = za1Var.f40045j0) != null) {
                oVar = dcVar2.G;
                dcVar = dcVar2;
            } else {
                ke keVar = za1Var.f40046k0;
                if (keVar != null) {
                    oVar = keVar.f35042b1;
                    dcVar = keVar;
                } else {
                    oVar = null;
                    dcVar = null;
                }
            }
            if (oVar != null && dcVar != null) {
                x8 x8Var = this.f38750b;
                RectF rectF2 = this.f38749a;
                hh.k.c(dcVar, x8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    za1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
