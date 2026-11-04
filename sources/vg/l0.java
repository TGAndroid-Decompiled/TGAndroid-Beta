package vg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class l0 extends org.telegram.ui.Cells.q {
    public s1 f56700e;
    public Paint f56701f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        s1 s1Var = this.f56700e;
        s1Var.f56831c.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(5.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(5.0f));
        float f10 = -L;
        s1Var.f56829a.set(f10, f10, getWidth() + L, getHeight() + L);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        s1Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f56701f);
        super.draw(canvas);
    }
}
