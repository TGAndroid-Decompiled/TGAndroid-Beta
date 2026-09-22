package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class y91 implements bh.a {
    public final RectF f39887a = new RectF();
    public final x8 f39888b;
    public final bb1 f39889c;

    public y91(bb1 bb1Var, x8 x8Var) {
        this.f39889c = bb1Var;
        this.f39888b = x8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f414a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.o oVar;
        dc dcVar;
        dc dcVar2;
        bb1 bb1Var = this.f39889c;
        bb1Var.fragmentView.getMeasuredWidth();
        bb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = bb1Var.T;
                dcVar = bb1Var.S;
            } else if (i10 == 1 && (dcVar2 = bb1Var.f32344j0) != null) {
                oVar = dcVar2.G;
                dcVar = dcVar2;
            } else {
                ke keVar = bb1Var.f32345k0;
                if (keVar != null) {
                    oVar = keVar.f35155b1;
                    dcVar = keVar;
                } else {
                    oVar = null;
                    dcVar = null;
                }
            }
            if (oVar != null && dcVar != null) {
                x8 x8Var = this.f39888b;
                RectF rectF2 = this.f39887a;
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
