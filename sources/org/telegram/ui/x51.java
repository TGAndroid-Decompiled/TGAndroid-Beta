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
        r41 r41Var = g71Var.f33726g0;
        x51 x51Var = g71Var.f33724f0;
        g61 g61Var = g71Var.U;
        if (g61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = r41Var.getX() + x51Var.getX();
            float y10 = r41Var.getY() + x51Var.getY();
            s5.e eVar = (s5.e) g61Var;
            zg.b0 b0Var = (zg.b0) eVar.f43106b;
            zg.a0 a0Var = b0Var.f49226a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.pk0 delegate = ((org.telegram.ui.Components.qk0) eVar.f43107c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f49246y == 1) {
                y3 = a0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = a0Var.getY() + b0Var.f49228c.getY();
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
