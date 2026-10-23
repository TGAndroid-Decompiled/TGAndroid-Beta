package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class wo0 extends org.telegram.ui.Components.mm0 {
    public final int Y2;
    public final fp0 Z2;

    public wo0(fp0 fp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Z2 = fp0Var;
        this.Y2 = i10;
    }

    @Override
    public final Integer X0(int i10) {
        fp0 fp0Var = this.Z2;
        if ((i10 >= fp0Var.f37386b0 && i10 < fp0Var.f37388c0) || (i10 >= fp0Var.f37389d0 && i10 < fp0Var.f37390e0)) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fp0 fp0Var = this.Z2;
        if (fp0Var.G && fp0Var.E != null && fp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(fp0Var.E.getLeft() + fp0Var.F.getLeft(), fp0Var.F.getTop());
            fp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ai.y9 y9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        fp0 fp0Var = this.Z2;
        lp0 lp0Var = fp0Var.f37402p0;
        fp0Var.h();
        if (fp0Var.K != null) {
            if (fp0Var.J != null && fp0Var.c()) {
                fp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.Y2 == 1) {
            y9Var = lp0Var.f39294c;
        } else {
            y9Var = lp0Var.f39292b;
        }
        if (y9Var != null && fp0Var.c()) {
            y9Var.a();
        }
    }
}
