package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class u41 extends s51 {
    public final d61 A;

    public u41(d61 d61Var, Context context, boolean z10) {
        super(d61Var, context, z10);
        this.A = d61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y8;
        d61 d61Var = this.A;
        n31 n31Var = d61Var.f37324c0;
        u41 u41Var = d61Var.f37321b0;
        d51 d51Var = d61Var.Q;
        if (d51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x4 = n31Var.getX() + u41Var.getX();
            float y10 = n31Var.getY() + u41Var.getY();
            kg.w wVar = (kg.w) d51Var;
            kg.d0 d0Var = (kg.d0) wVar.f13882b;
            kg.c0 c0Var = d0Var.f13681a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f9 = 0;
            rectF.set(f9, f9, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ek0 delegate = ((org.telegram.ui.Components.fk0) wVar.f13883c).getDelegate();
            float x10 = c0Var.getX() + x4;
            if (d0Var.f13702y == 1) {
                y8 = c0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y8 = c0Var.getY() + d0Var.f13683c.getY();
            }
            delegate.G(canvas, rectF, 0.0f, x10, y8 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            if (this.A.Q != null) {
                invalidate();
            }
        }
    }
}
