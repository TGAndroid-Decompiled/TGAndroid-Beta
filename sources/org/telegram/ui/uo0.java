package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class uo0 extends org.telegram.ui.Components.im0 {
    public final int V2;
    public final dp0 W2;

    public uo0(dp0 dp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = dp0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        dp0 dp0Var = this.W2;
        if ((i10 >= dp0Var.f36245b0 && i10 < dp0Var.f36247c0) || (i10 >= dp0Var.f36248d0 && i10 < dp0Var.f36249e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dp0 dp0Var = this.W2;
        if (dp0Var.G && dp0Var.E != null && dp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(dp0Var.E.getLeft() + dp0Var.F.getLeft(), dp0Var.F.getTop());
            dp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ai.x9 x9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        dp0 dp0Var = this.W2;
        jp0 jp0Var = dp0Var.f36261p0;
        dp0Var.h();
        if (dp0Var.K != null) {
            if (dp0Var.J != null && dp0Var.c()) {
                dp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            x9Var = jp0Var.f38243c;
        } else {
            x9Var = jp0Var.f38241b;
        }
        if (x9Var != null && dp0Var.c()) {
            x9Var.a();
        }
    }
}
