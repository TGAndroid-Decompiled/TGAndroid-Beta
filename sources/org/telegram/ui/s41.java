package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class s41 extends q51 {
    public final b61 A;

    public s41(b61 b61Var, Context context, boolean z10) {
        super(b61Var, context, z10);
        this.A = b61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        b61 b61Var = this.A;
        dh.g gVar = b61Var.f36667c0;
        s41 s41Var = b61Var.f36664b0;
        b51 b51Var = b61Var.Q;
        if (b51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = gVar.getX() + s41Var.getX();
            float y11 = gVar.getY() + s41Var.getY();
            b5.d dVar = (b5.d) b51Var;
            hg.e0 e0Var = (hg.e0) dVar.f1449b;
            hg.d0 d0Var = e0Var.f10574a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.tj0 delegate = ((org.telegram.ui.Components.uj0) dVar.f1450c).getDelegate();
            float x11 = d0Var.getX() + x10;
            if (e0Var.f10595y == 1) {
                y10 = d0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y10 = d0Var.getY() + e0Var.f10576c.getY();
            }
            delegate.s(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
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
