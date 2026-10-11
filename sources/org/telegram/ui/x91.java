package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class x91 implements bh.a {
    public final RectF f44020a = new RectF();
    public final u8 f44021b;
    public final ab1 f44022c;

    public x91(ab1 ab1Var, u8 u8Var) {
        this.f44022c = ab1Var;
        this.f44021b = u8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f536a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        bc bcVar;
        bc bcVar2;
        ab1 ab1Var = this.f44022c;
        ab1Var.fragmentView.getMeasuredWidth();
        ab1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = ab1Var.T;
                bcVar = ab1Var.S;
            } else if (i10 == 1 && (bcVar2 = ab1Var.f35975j0) != null) {
                nVar = bcVar2.G;
                bcVar = bcVar2;
            } else {
                je jeVar = ab1Var.f35976k0;
                if (jeVar != null) {
                    nVar = jeVar.f38996b1;
                    bcVar = jeVar;
                } else {
                    nVar = null;
                    bcVar = null;
                }
            }
            if (nVar != null && bcVar != null) {
                u8 u8Var = this.f44021b;
                RectF rectF2 = this.f44020a;
                hh.j.c(bcVar, u8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ab1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
