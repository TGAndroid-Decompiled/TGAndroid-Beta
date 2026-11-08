package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class uw0 extends Drawable implements org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.Components.i6 f50434a;
    public final Paint f50435b;
    public int f50436c;
    public float d;
    public float f50437e;
    public final org.telegram.ui.Cells.j0 f50438f;
    public org.telegram.ui.Cells.t0 h;

    public uw0(String str) {
        Paint paint = new Paint(1);
        this.f50435b = paint;
        this.d = 1.0f;
        this.f50437e = 1.0f;
        this.f50438f = new org.telegram.ui.Cells.j0(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.f50434a = i6Var;
        i6Var.setCallback(new tq(1, this));
        i6Var.t(str, true, true);
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.f34552b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i7) {
        Paint paint = this.f50435b;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f50437e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f50438f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.f50435b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i7 = this.f50436c;
        org.telegram.ui.Components.i6 i6Var = this.f50434a;
        i6Var.u(i7);
        i6Var.B = (int) (f10 * 255.0f);
        i6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
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
        return (int) (this.f50434a.d + org.telegram.messenger.g0.L(11.0f));
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
