package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class to0 extends org.telegram.ui.Components.jm0 {
    public final int V2;
    public final cp0 W2;

    public to0(cp0 cp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = cp0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        cp0 cp0Var = this.W2;
        if ((i10 >= cp0Var.f36025b0 && i10 < cp0Var.f36027c0) || (i10 >= cp0Var.f36028d0 && i10 < cp0Var.f36029e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cp0 cp0Var = this.W2;
        if (cp0Var.G && cp0Var.E != null && cp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(cp0Var.E.getLeft() + cp0Var.F.getLeft(), cp0Var.F.getTop());
            cp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ai.y9 y9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        cp0 cp0Var = this.W2;
        ip0 ip0Var = cp0Var.f36041p0;
        cp0Var.h();
        if (cp0Var.K != null) {
            if (cp0Var.J != null && cp0Var.c()) {
                cp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            y9Var = ip0Var.f38087c;
        } else {
            y9Var = ip0Var.f38085b;
        }
        if (y9Var != null && cp0Var.c()) {
            y9Var.a();
        }
    }
}
