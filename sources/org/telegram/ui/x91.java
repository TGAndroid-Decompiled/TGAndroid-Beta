package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class x91 implements bh.a {
    public final RectF f39469a = new RectF();
    public final y8 f39470b;
    public final ab1 f39471c;

    public x91(ab1 ab1Var, y8 y8Var) {
        this.f39471c = ab1Var;
        this.f39470b = y8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.o oVar;
        ec ecVar;
        ec ecVar2;
        ab1 ab1Var = this.f39471c;
        ab1Var.fragmentView.getMeasuredWidth();
        ab1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = ab1Var.T;
                ecVar = ab1Var.S;
            } else if (i10 == 1 && (ecVar2 = ab1Var.f31795j0) != null) {
                oVar = ecVar2.G;
                ecVar = ecVar2;
            } else {
                le leVar = ab1Var.f31796k0;
                if (leVar != null) {
                    oVar = leVar.f35505b1;
                    ecVar = leVar;
                } else {
                    oVar = null;
                    ecVar = null;
                }
            }
            if (oVar != null && ecVar != null) {
                y8 y8Var = this.f39470b;
                RectF rectF2 = this.f39469a;
                hh.k.c(ecVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ab1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                oVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
