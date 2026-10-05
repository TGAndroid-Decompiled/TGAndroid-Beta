package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class r51 extends p61 {
    public final a71 E;

    public r51(a71 a71Var, Context context, boolean z10) {
        super(a71Var, context, z10);
        this.E = a71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        a71 a71Var = this.E;
        l41 l41Var = a71Var.f34737g0;
        r51 r51Var = a71Var.f34735f0;
        a61 a61Var = a71Var.U;
        if (a61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l41Var.getX() + r51Var.getX();
            float y10 = l41Var.getY() + r51Var.getY();
            rg.x xVar = (rg.x) a61Var;
            zg.z zVar = (zg.z) xVar.f46364b;
            zg.y yVar = zVar.f53550a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.rk0 delegate = ((org.telegram.ui.Components.sk0) xVar.f46365c).getDelegate();
            float x11 = yVar.getX() + x10;
            if (zVar.f53571y == 1) {
                y3 = yVar.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = yVar.getY() + zVar.f53552c.getY();
            }
            delegate.H(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
