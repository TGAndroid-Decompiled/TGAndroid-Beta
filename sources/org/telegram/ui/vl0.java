package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class vl0 extends org.telegram.ui.Components.pj0 {
    public final int f50755e3;
    public final em0 f50756f3;

    public vl0(em0 em0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f50756f3 = em0Var;
        this.f50755e3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        em0 em0Var = this.f50756f3;
        if ((i7 >= em0Var.f45384b0 && i7 < em0Var.f45386c0) || (i7 >= em0Var.f45387d0 && i7 < em0Var.f45389e0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        em0 em0Var = this.f50756f3;
        if (em0Var.G && em0Var.E != null && em0Var.F != null) {
            int save = canvas.save();
            canvas.translate(em0Var.E.getLeft() + em0Var.F.getLeft(), em0Var.F.getTop());
            em0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bi.v9 v9Var;
        super.onLayout(z9, i7, i10, i11, i12);
        em0 em0Var = this.f50756f3;
        km0 km0Var = em0Var.f45401p0;
        em0Var.h();
        if (em0Var.K != null) {
            if (em0Var.J != null && em0Var.c()) {
                em0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f50755e3 == 1) {
            v9Var = km0Var.f47371c;
        } else {
            v9Var = km0Var.f47369b;
        }
        if (v9Var != null && em0Var.c()) {
            v9Var.a();
        }
    }
}
