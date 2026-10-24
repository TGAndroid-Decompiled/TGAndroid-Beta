package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class r41 extends p51 {
    public final a61 G;

    public r41(a61 a61Var, Context context, boolean z10) {
        super(a61Var, context, z10);
        this.G = a61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        a61 a61Var = this.G;
        m41 m41Var = a61Var.f35620g0;
        r41 r41Var = a61Var.f35618f0;
        a51 a51Var = a61Var.U;
        if (a51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = m41Var.getX() + r41Var.getX();
            float y10 = m41Var.getY() + r41Var.getY();
            ah.h0 h0Var = (ah.h0) a51Var;
            ah.t0 t0Var = (ah.t0) h0Var.f773b;
            ah.s0 s0Var = t0Var.f869a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.el0 delegate = ((org.telegram.ui.Components.fl0) h0Var.f774c).getDelegate();
            float x11 = s0Var.getX() + x10;
            if (t0Var.f889y == 1) {
                y3 = s0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = s0Var.getY() + t0Var.f871c.getY();
            }
            delegate.s(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
