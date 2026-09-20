package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class y91 implements bh.a {
    public final RectF f39867a = new RectF();
    public final x8 f39868b;
    public final bb1 f39869c;

    public y91(bb1 bb1Var, x8 x8Var) {
        this.f39869c = bb1Var;
        this.f39868b = x8Var;
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
        bb1 bb1Var = this.f39869c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = bb1Var.T;
                dcVar = bb1Var.S;
            } else if (i10 == 1 && (dcVar2 = bb1Var.f32326j0) != null) {
                oVar = dcVar2.G;
                dcVar = dcVar2;
            } else {
                ke keVar = bb1Var.f32327k0;
                if (keVar != null) {
                    oVar = keVar.f35133b1;
                    dcVar = keVar;
                } else {
                    oVar = null;
                    dcVar = null;
                }
            }
            if (oVar != null && dcVar != null) {
                x8 x8Var = this.f39868b;
                RectF rectF2 = this.f39867a;
                hh.k.c(dcVar, x8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    bb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
