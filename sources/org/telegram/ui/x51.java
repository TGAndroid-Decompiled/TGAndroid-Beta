package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends v61 {
    public final g71 E;

    public x51(g71 g71Var, Context context, boolean z10) {
        super(g71Var, context, z10);
        this.E = g71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        g71 g71Var = this.E;
        s51 s51Var = g71Var.f33794g0;
        x51 x51Var = g71Var.f33792f0;
        g61 g61Var = g71Var.U;
        if (g61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = s51Var.getX() + x51Var.getX();
            float y10 = s51Var.getY() + x51Var.getY();
            tg.d dVar = (tg.d) g61Var;
            zg.c0 c0Var = (zg.c0) dVar.f43121b;
            zg.b0 b0Var = c0Var.f48983a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ek0 delegate = ((org.telegram.ui.Components.fk0) dVar.f43122c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f49003y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f48985c.getY();
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
