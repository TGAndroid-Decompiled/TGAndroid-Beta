package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class ul0 extends org.telegram.ui.Components.qj0 {
    public final int f50422e3;
    public final dm0 f50423f3;

    public ul0(dm0 dm0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f50423f3 = dm0Var;
        this.f50422e3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        dm0 dm0Var = this.f50423f3;
        if ((i7 >= dm0Var.f45061b0 && i7 < dm0Var.f45063c0) || (i7 >= dm0Var.f45064d0 && i7 < dm0Var.f45066e0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dm0 dm0Var = this.f50423f3;
        if (dm0Var.G && dm0Var.E != null && dm0Var.F != null) {
            int save = canvas.save();
            canvas.translate(dm0Var.E.getLeft() + dm0Var.F.getLeft(), dm0Var.F.getTop());
            dm0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bi.v9 v9Var;
        super.onLayout(z9, i7, i10, i11, i12);
        dm0 dm0Var = this.f50423f3;
        jm0 jm0Var = dm0Var.f45078p0;
        dm0Var.h();
        if (dm0Var.K != null) {
            if (dm0Var.J != null && dm0Var.c()) {
                dm0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f50422e3 == 1) {
            v9Var = jm0Var.f47040c;
        } else {
            v9Var = jm0Var.f47038b;
        }
        if (v9Var != null && dm0Var.c()) {
            v9Var.a();
        }
    }
}
