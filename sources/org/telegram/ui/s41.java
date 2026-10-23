package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class s41 extends q51 {
    public final b61 G;

    public s41(b61 b61Var, Context context, boolean z10) {
        super(b61Var, context, z10);
        this.G = b61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        b61 b61Var = this.G;
        n41 n41Var = b61Var.f35903g0;
        s41 s41Var = b61Var.f35901f0;
        b51 b51Var = b61Var.U;
        if (b51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = n41Var.getX() + s41Var.getX();
            float y10 = n41Var.getY() + s41Var.getY();
            ah.h0 h0Var = (ah.h0) b51Var;
            ah.t0 t0Var = (ah.t0) h0Var.f773b;
            ah.s0 s0Var = t0Var.f869a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.fl0 delegate = ((org.telegram.ui.Components.gl0) h0Var.f774c).getDelegate();
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
