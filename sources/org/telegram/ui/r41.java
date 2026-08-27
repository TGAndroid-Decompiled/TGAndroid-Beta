package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class r41 extends p51 {
    public final a61 A;

    public r41(a61 a61Var, Context context, boolean z10) {
        super(a61Var, context, z10);
        this.A = a61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a61 a61Var = this.A;
        ag.d dVar = a61Var.f36390c0;
        r41 r41Var = a61Var.f36387b0;
        a51 a51Var = a61Var.Q;
        if (a51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x8 = dVar.getX() + r41Var.getX();
            float y10 = dVar.getY() + r41Var.getY();
            ag.h0 h0Var = (ag.h0) a51Var;
            ig.d0 d0Var = (ig.d0) h0Var.f409b;
            ig.c0 c0Var = d0Var.f11268a;
            org.telegram.ui.Components.wj0 wj0Var = (org.telegram.ui.Components.wj0) h0Var.f410c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            wj0Var.getDelegate().r(canvas, rectF, 0.0f, c0Var.getX() + x8, (d0Var.f11289y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.f11270c.getY()) + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.A.Q != null) {
                invalidate();
            }
        }
    }
}
