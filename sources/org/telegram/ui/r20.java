package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class r20 extends dr0 {
    public final c40 T;

    public r20(c40 c40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = c40Var;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        c40 c40Var = this.T;
        a20 a20Var = c40Var.f45942m1;
        b20 b20Var = c40Var.B4;
        if (f10 > 0.0f) {
            float x10 = c40Var.f29682b.getX() + b20Var.getX();
            float y10 = c40Var.f29682b.getY() + b20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, a20Var.getMeasuredWidth() + x10, a20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            b20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        a20 a20Var = this.T.f45942m1;
        super.e();
        for (int i7 = 0; i7 < a20Var.getChildCount(); i7++) {
            a20Var.getChildAt(i7).invalidate();
        }
    }
}
