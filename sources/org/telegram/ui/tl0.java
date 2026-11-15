package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class tl0 extends org.telegram.ui.Components.uj0 {
    public final int f51608f3;
    public final cm0 f51609g3;

    public tl0(cm0 cm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f51609g3 = cm0Var;
        this.f51608f3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        cm0 cm0Var = this.f51609g3;
        if ((i7 >= cm0Var.f46194c0 && i7 < cm0Var.f46195d0) || (i7 >= cm0Var.f46197e0 && i7 < cm0Var.f46199f0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cm0 cm0Var = this.f51609g3;
        if (cm0Var.H && cm0Var.F != null && cm0Var.G != null) {
            int save = canvas.save();
            canvas.translate(cm0Var.F.getLeft() + cm0Var.G.getLeft(), cm0Var.G.getTop());
            cm0Var.F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        di.m8 m8Var;
        super.onLayout(z10, i7, i10, i11, i12);
        cm0 cm0Var = this.f51609g3;
        im0 im0Var = cm0Var.f46210q0;
        cm0Var.h();
        if (cm0Var.L != null) {
            if (cm0Var.K != null && cm0Var.c()) {
                cm0Var.K.g(false);
                return;
            }
            return;
        }
        if (this.f51608f3 == 1) {
            m8Var = im0Var.f48088c;
        } else {
            m8Var = im0Var.f48086b;
        }
        if (m8Var != null && cm0Var.c()) {
            m8Var.a();
        }
    }
}
