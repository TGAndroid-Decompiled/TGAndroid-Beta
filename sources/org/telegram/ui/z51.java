package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends x61 {
    public final i71 E;

    public z51(i71 i71Var, Context context, boolean z10) {
        super(i71Var, context, z10);
        this.E = i71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        i71 i71Var = this.E;
        t41 t41Var = i71Var.f34464g0;
        z51 z51Var = i71Var.f34462f0;
        i61 i61Var = i71Var.U;
        if (i61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = t41Var.getX() + z51Var.getX();
            float y10 = t41Var.getY() + z51Var.getY();
            tg.d dVar = (tg.d) i61Var;
            zg.c0 c0Var = (zg.c0) dVar.f43148b;
            zg.b0 b0Var = c0Var.f49011a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.fk0 delegate = ((org.telegram.ui.Components.gk0) dVar.f43149c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f49031y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f49013c.getY();
            }
            delegate.n(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.E.U != null) {
                invalidate();
            }
        }
    }
}
