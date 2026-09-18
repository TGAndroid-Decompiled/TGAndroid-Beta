package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class x91 implements bh.a {
    public final RectF f39474a = new RectF();
    public final y8 f39475b;
    public final ab1 f39476c;

    public x91(ab1 ab1Var, y8 y8Var) {
        this.f39476c = ab1Var;
        this.f39475b = y8Var;
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
        ab1 ab1Var = this.f39476c;
        ab1Var.fragmentView.getMeasuredWidth();
        ab1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                oVar = ab1Var.T;
                ecVar = ab1Var.S;
            } else if (i10 == 1 && (ecVar2 = ab1Var.f31799j0) != null) {
                oVar = ecVar2.G;
                ecVar = ecVar2;
            } else {
                le leVar = ab1Var.f31800k0;
                if (leVar != null) {
                    oVar = leVar.f35510b1;
                    ecVar = leVar;
                } else {
                    oVar = null;
                    ecVar = null;
                }
            }
            if (oVar != null && ecVar != null) {
                y8 y8Var = this.f39475b;
                RectF rectF2 = this.f39474a;
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
