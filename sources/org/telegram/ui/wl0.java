package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class wl0 extends org.telegram.ui.Components.ck0 {
    public final int f53405f3;
    public final fm0 f53406g3;

    public wl0(fm0 fm0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f53406g3 = fm0Var;
        this.f53405f3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        fm0 fm0Var = this.f53406g3;
        if ((i7 >= fm0Var.f47699c0 && i7 < fm0Var.f47700d0) || (i7 >= fm0Var.f47702e0 && i7 < fm0Var.f47704f0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fm0 fm0Var = this.f53406g3;
        if (fm0Var.H && fm0Var.F != null && fm0Var.G != null) {
            int save = canvas.save();
            canvas.translate(fm0Var.F.getLeft() + fm0Var.G.getLeft(), fm0Var.G.getTop());
            fm0Var.F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        di.o8 o8Var;
        super.onLayout(z10, i7, i10, i11, i12);
        fm0 fm0Var = this.f53406g3;
        lm0 lm0Var = fm0Var.f47715q0;
        fm0Var.h();
        if (fm0Var.L != null) {
            if (fm0Var.K != null && fm0Var.c()) {
                fm0Var.K.l(false);
                return;
            }
            return;
        }
        if (this.f53405f3 == 1) {
            o8Var = lm0Var.f49595c;
        } else {
            o8Var = lm0Var.f49593b;
        }
        if (o8Var != null && fm0Var.c()) {
            o8Var.a();
        }
    }
}
