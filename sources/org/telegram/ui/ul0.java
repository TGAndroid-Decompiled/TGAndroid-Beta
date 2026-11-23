package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class ul0 extends org.telegram.ui.Components.ek0 {
    public final int f52684f3;
    public final dm0 f52685g3;

    public ul0(dm0 dm0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f52685g3 = dm0Var;
        this.f52684f3 = i7;
    }

    @Override
    public final Integer V0(int i7) {
        dm0 dm0Var = this.f52685g3;
        if ((i7 >= dm0Var.f47169c0 && i7 < dm0Var.f47170d0) || (i7 >= dm0Var.f47172e0 && i7 < dm0Var.f47174f0)) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dm0 dm0Var = this.f52685g3;
        if (dm0Var.H && dm0Var.F != null && dm0Var.G != null) {
            int save = canvas.save();
            canvas.translate(dm0Var.F.getLeft() + dm0Var.G.getLeft(), dm0Var.G.getTop());
            dm0Var.F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        di.p8 p8Var;
        super.onLayout(z10, i7, i10, i11, i12);
        dm0 dm0Var = this.f52685g3;
        jm0 jm0Var = dm0Var.f47185q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K != null && dm0Var.c()) {
                dm0Var.K.l(false);
                return;
            }
            return;
        }
        if (this.f52684f3 == 1) {
            p8Var = jm0Var.f49158c;
        } else {
            p8Var = jm0Var.f49156b;
        }
        if (p8Var != null && dm0Var.c()) {
            p8Var.a();
        }
    }
}
