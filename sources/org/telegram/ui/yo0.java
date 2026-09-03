package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class yo0 extends org.telegram.ui.Components.rl0 {
    public final int U2;
    public final hp0 V2;

    public yo0(hp0 hp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.V2 = hp0Var;
        this.U2 = i10;
    }

    @Override
    public final Integer V0(int i10) {
        hp0 hp0Var = this.V2;
        if ((i10 >= hp0Var.V && i10 < hp0Var.W) || (i10 >= hp0Var.f34719a0 && i10 < hp0Var.f34721b0)) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hp0 hp0Var = this.V2;
        if (hp0Var.D && hp0Var.B != null && hp0Var.C != null) {
            int save = canvas.save();
            canvas.translate(hp0Var.B.getLeft() + hp0Var.C.getLeft(), hp0Var.C.getTop());
            hp0Var.B.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        lh.l7 l7Var;
        super.onLayout(z4, i10, i11, i12, i13);
        hp0 hp0Var = this.V2;
        np0 np0Var = hp0Var.m0;
        hp0Var.h();
        if (hp0Var.H != null) {
            if (hp0Var.G != null && hp0Var.c()) {
                hp0Var.G.g(false);
                return;
            }
            return;
        }
        if (this.U2 == 1) {
            l7Var = np0Var.f36557c;
        } else {
            l7Var = np0Var.f36555b;
        }
        if (l7Var != null && hp0Var.c()) {
            l7Var.a();
        }
    }
}
