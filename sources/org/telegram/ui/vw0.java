package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class vw0 extends Drawable implements org.telegram.ui.ActionBar.m5 {
    public final org.telegram.ui.Components.m6 f53044a;
    public final Paint f53045b;
    public int f53046c;
    public float d;
    public float f53047e;
    public final org.telegram.ui.Cells.k0 f53048f;
    public org.telegram.ui.Cells.v0 h;

    public vw0(String str) {
        Paint paint = new Paint(1);
        this.f53045b = paint;
        this.d = 1.0f;
        this.f53047e = 1.0f;
        this.f53048f = new org.telegram.ui.Cells.k0(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false);
        this.f53044a = m6Var;
        m6Var.setCallback(new wq(1, this));
        m6Var.t(str, true, true);
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.f37394b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i7) {
        Paint paint = this.f53045b;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f53047e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f53048f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.f53045b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i7 = this.f53046c;
        org.telegram.ui.Components.m6 m6Var = this.f53044a;
        m6Var.u(i7);
        m6Var.C = (int) (f10 * 255.0f);
        m6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f53044a.d + org.telegram.messenger.g0.L(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
