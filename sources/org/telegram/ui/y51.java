package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class y51 extends w61 {
    public final h71 E;

    public y51(h71 h71Var, Context context, boolean z10) {
        super(h71Var, context, z10);
        this.E = h71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        h71 h71Var = this.E;
        t51 t51Var = h71Var.f34130g0;
        y51 y51Var = h71Var.f34128f0;
        h61 h61Var = h71Var.U;
        if (h61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = t51Var.getX() + y51Var.getX();
            float y10 = t51Var.getY() + y51Var.getY();
            tg.d dVar = (tg.d) h61Var;
            zg.c0 c0Var = (zg.c0) dVar.f43117b;
            zg.b0 b0Var = c0Var.f48976a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ek0 delegate = ((org.telegram.ui.Components.fk0) dVar.f43118c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f48996y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f48978c.getY();
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
