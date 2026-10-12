package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class rp0 extends org.telegram.ui.Components.mm0 {
    public final int V2;
    public final aq0 W2;

    public rp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.W2 = aq0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        aq0 aq0Var = this.W2;
        if ((i10 >= aq0Var.f34306b0 && i10 < aq0Var.f34308c0) || (i10 >= aq0Var.f34309d0 && i10 < aq0Var.f34310e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        aq0 aq0Var = this.W2;
        if (aq0Var.G && aq0Var.E != null && aq0Var.F != null) {
            int save = canvas.save();
            canvas.translate(aq0Var.E.getLeft() + aq0Var.F.getLeft(), aq0Var.F.getTop());
            aq0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zh.f5 f5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        aq0 aq0Var = this.W2;
        gq0 gq0Var = aq0Var.f34322p0;
        aq0Var.h();
        if (aq0Var.K != null) {
            if (aq0Var.J != null && aq0Var.c()) {
                aq0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            f5Var = gq0Var.f36452c;
        } else {
            f5Var = gq0Var.f36450b;
        }
        if (f5Var != null && aq0Var.c()) {
            f5Var.a();
        }
    }
}
