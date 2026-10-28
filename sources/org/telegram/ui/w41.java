package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends u51 {
    public final f61 G;

    public w41(f61 f61Var, Context context, boolean z10) {
        super(f61Var, context, z10);
        this.G = f61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        f61 f61Var = this.G;
        r41 r41Var = f61Var.f39200g0;
        w41 w41Var = f61Var.f39198f0;
        f51 f51Var = f61Var.U;
        if (f51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x9 = r41Var.getX() + w41Var.getX();
            float y10 = r41Var.getY() + w41Var.getY();
            ai.f0 f0Var = (ai.f0) f51Var;
            bh.i0 i0Var = (bh.i0) f0Var.f1485b;
            bh.h0 h0Var = i0Var.f4047a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.fl0 delegate = ((org.telegram.ui.Components.gl0) f0Var.f1486c).getDelegate();
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
