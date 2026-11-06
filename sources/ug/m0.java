package ug;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class m0 extends org.telegram.ui.Cells.q {
    public p1 f56610e;
    public Paint f56611f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        p1 p1Var = this.f56610e;
        p1Var.f56673c.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(5.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(5.0f));
        float f10 = -L;
        p1Var.f56671a.set(f10, f10, getWidth() + L, getHeight() + L);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        p1Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f56611f);
        super.draw(canvas);
    }
}
