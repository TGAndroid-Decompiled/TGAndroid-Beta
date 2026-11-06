package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class sl0 extends org.telegram.ui.Components.pj0 {
    public final int f49787e3;
    public final bm0 f49788f3;

    public sl0(bm0 bm0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f49788f3 = bm0Var;
        this.f49787e3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        bm0 bm0Var = this.f49788f3;
        if ((i7 >= bm0Var.f44429b0 && i7 < bm0Var.f44431c0) || (i7 >= bm0Var.f44432d0 && i7 < bm0Var.f44434e0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bm0 bm0Var = this.f49788f3;
        if (bm0Var.G && bm0Var.E != null && bm0Var.F != null) {
            int save = canvas.save();
            canvas.translate(bm0Var.E.getLeft() + bm0Var.F.getLeft(), bm0Var.F.getTop());
            bm0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bi.v9 v9Var;
        super.onLayout(z9, i7, i10, i11, i12);
        bm0 bm0Var = this.f49788f3;
        hm0 hm0Var = bm0Var.f44446p0;
        bm0Var.h();
        if (bm0Var.K != null) {
            if (bm0Var.J != null && bm0Var.c()) {
                bm0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f49787e3 == 1) {
            v9Var = hm0Var.f46453c;
        } else {
            v9Var = hm0Var.f46451b;
        }
        if (v9Var != null && bm0Var.c()) {
            v9Var.a();
        }
    }
}
