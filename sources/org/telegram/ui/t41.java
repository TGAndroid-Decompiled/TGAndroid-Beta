package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class t41 extends r51 {
    public final c61 G;

    public t41(c61 c61Var, Context context, boolean z10) {
        super(c61Var, context, z10);
        this.G = c61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        c61 c61Var = this.G;
        o41 o41Var = c61Var.f38294g0;
        t41 t41Var = c61Var.f38292f0;
        c51 c51Var = c61Var.U;
        if (c51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x9 = o41Var.getX() + t41Var.getX();
            float y10 = o41Var.getY() + t41Var.getY();
            ai.f0 f0Var = (ai.f0) c51Var;
            bh.i0 i0Var = (bh.i0) f0Var.f1485b;
            bh.h0 h0Var = i0Var.f4047a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.el0 delegate = ((org.telegram.ui.Components.fl0) f0Var.f1486c).getDelegate();
            float x10 = h0Var.getX() + x9;
            if (i0Var.f4067y == 1) {
                y3 = h0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = h0Var.getY() + i0Var.f4049c.getY();
            }
            delegate.l(canvas, rectF, 0.0f, x10, y3 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.G.U != null) {
                invalidate();
            }
        }
    }
}
