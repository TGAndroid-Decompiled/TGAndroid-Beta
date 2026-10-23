package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class r81 implements ch.a {
    public final RectF f41050a = new RectF();
    public final y8 f41051b;
    public final u91 f41052c;

    public r81(u91 u91Var, y8 y8Var) {
        this.f41052c = u91Var;
        this.f41051b = y8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4360a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        cc ccVar;
        cc ccVar2;
        u91 u91Var = this.f41052c;
        u91Var.fragmentView.getMeasuredWidth();
        u91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(u91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = u91Var.T;
                ccVar = u91Var.S;
            } else if (i10 == 1 && (ccVar2 = u91Var.f42323j0) != null) {
                lVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                ie ieVar = u91Var.f42324k0;
                if (ieVar != null) {
                    lVar = ieVar.f38155b1;
                    ccVar = ieVar;
                } else {
                    lVar = null;
                    ccVar = null;
                }
            }
            if (lVar != null && ccVar != null) {
                y8 y8Var = this.f41051b;
                RectF rectF2 = this.f41050a;
                ih.k.c(ccVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    u91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
