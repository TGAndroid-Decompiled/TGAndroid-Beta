package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class vo0 extends org.telegram.ui.Components.lm0 {
    public final int Y2;
    public final ep0 Z2;

    public vo0(ep0 ep0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Z2 = ep0Var;
        this.Y2 = i10;
    }

    @Override
    public final Integer X0(int i10) {
        ep0 ep0Var = this.Z2;
        if ((i10 >= ep0Var.f36967b0 && i10 < ep0Var.f36969c0) || (i10 >= ep0Var.f36970d0 && i10 < ep0Var.f36971e0)) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ep0 ep0Var = this.Z2;
        if (ep0Var.G && ep0Var.E != null && ep0Var.F != null) {
            int save = canvas.save();
            canvas.translate(ep0Var.E.getLeft() + ep0Var.F.getLeft(), ep0Var.F.getTop());
            ep0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ai.y9 y9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        ep0 ep0Var = this.Z2;
        kp0 kp0Var = ep0Var.f36983p0;
        ep0Var.h();
        if (ep0Var.K != null) {
            if (ep0Var.J != null && ep0Var.c()) {
                ep0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.Y2 == 1) {
            y9Var = kp0Var.f39002c;
        } else {
            y9Var = kp0Var.f39000b;
        }
        if (y9Var != null && ep0Var.c()) {
            y9Var.a();
        }
    }
}
