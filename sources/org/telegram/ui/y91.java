package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class y91 implements bh.a {
    public final RectF f44292a = new RectF();
    public final v8 f44293b;
    public final bb1 f44294c;

    public y91(bb1 bb1Var, v8 v8Var) {
        this.f44294c = bb1Var;
        this.f44293b = v8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f536a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        cc ccVar;
        cc ccVar2;
        bb1 bb1Var = this.f44294c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = bb1Var.T;
                ccVar = bb1Var.S;
            } else if (i10 == 1 && (ccVar2 = bb1Var.f36216j0) != null) {
                nVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                ke keVar = bb1Var.f36217k0;
                if (keVar != null) {
                    nVar = keVar.f39232b1;
                    ccVar = keVar;
                } else {
                    nVar = null;
                    ccVar = null;
                }
            }
            if (nVar != null && ccVar != null) {
                v8 v8Var = this.f44293b;
                RectF rectF2 = this.f44292a;
                hh.j.c(ccVar, v8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
