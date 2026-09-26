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
        m51 m51Var = a71Var.f32024g0;
        r51 r51Var = a71Var.f32022f0;
        a61 a61Var = a71Var.U;
        if (a61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = m51Var.getX() + r51Var.getX();
            float y10 = m51Var.getY() + r51Var.getY();
            s5.e eVar = (s5.e) a61Var;
            zg.b0 b0Var = (zg.b0) eVar.f43136b;
            zg.a0 a0Var = b0Var.f49244a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.qk0 delegate = ((org.telegram.ui.Components.rk0) eVar.f43137c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f49264y == 1) {
                y3 = a0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = a0Var.getY() + b0Var.f49246c.getY();
            }
            delegate.m(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
