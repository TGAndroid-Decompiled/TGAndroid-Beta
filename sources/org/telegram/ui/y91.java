package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class y91 implements ch.a {
    public final RectF f43060a = new RectF();
    public final w8 f43061b;
    public final bb1 f43062c;

    public y91(bb1 bb1Var, w8 w8Var) {
        this.f43062c = bb1Var;
        this.f43061b = w8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2648a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        cc ccVar;
        cc ccVar2;
        bb1 bb1Var = this.f43062c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = bb1Var.T;
                ccVar = bb1Var.S;
            } else if (i10 == 1 && (ccVar2 = bb1Var.f34704j0) != null) {
                lVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                ke keVar = bb1Var.f34705k0;
                if (keVar != null) {
                    lVar = keVar.f38014b1;
                    ccVar = keVar;
                } else {
                    lVar = null;
                    ccVar = null;
                }
            }
            if (lVar != null && ccVar != null) {
                w8 w8Var = this.f43061b;
                RectF rectF2 = this.f43060a;
                ih.k.c(ccVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
