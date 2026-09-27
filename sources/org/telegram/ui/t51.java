package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends r61 {
    public final c71 E;

    public t51(c71 c71Var, Context context, boolean z10) {
        super(c71Var, context, z10);
        this.E = c71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        c71 c71Var = this.E;
        n41 n41Var = c71Var.f32583g0;
        t51 t51Var = c71Var.f32581f0;
        c61 c61Var = c71Var.U;
        if (c61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = n41Var.getX() + t51Var.getX();
            float y10 = n41Var.getY() + t51Var.getY();
            s5.e eVar = (s5.e) c61Var;
            zg.c0 c0Var = (zg.c0) eVar.f43182b;
            zg.b0 b0Var = c0Var.f49299a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.rk0 delegate = ((org.telegram.ui.Components.sk0) eVar.f43183c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f49319y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f49301c.getY();
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
