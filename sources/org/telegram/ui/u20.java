package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class u20 extends fr0 {
    public final f40 T;

    public u20(f40 f40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = f40Var;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        f40 f40Var = this.T;
        d20 d20Var = f40Var.f47489m1;
        e20 e20Var = f40Var.B4;
        if (f10 > 0.0f) {
            float x10 = f40Var.f30192b.getX() + e20Var.getX();
            float y10 = f40Var.f30192b.getY() + e20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, d20Var.getMeasuredWidth() + x10, d20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            e20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        d20 d20Var = this.T.f47489m1;
        super.e();
        for (int i7 = 0; i7 < d20Var.getChildCount(); i7++) {
            d20Var.getChildAt(i7).invalidate();
        }
    }
}
