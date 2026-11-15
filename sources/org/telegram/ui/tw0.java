package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class tw0 extends Drawable implements org.telegram.ui.ActionBar.i5 {
    public final org.telegram.ui.Components.g6 f51679a;
    public final Paint f51680b;
    public int f51681c;
    public float d;
    public float f51682e;
    public final org.telegram.ui.Cells.j0 f51683f;
    public org.telegram.ui.Cells.t0 h;

    public tw0(String str) {
        Paint paint = new Paint(1);
        this.f51680b = paint;
        this.d = 1.0f;
        this.f51682e = 1.0f;
        this.f51683f = new org.telegram.ui.Cells.j0(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f51679a = g6Var;
        g6Var.setCallback(new vq(1, this));
        g6Var.t(str, true, true);
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.f34833b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i7) {
        Paint paint = this.f51680b;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f51682e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f51683f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.f51680b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i7 = this.f51681c;
        org.telegram.ui.Components.g6 g6Var = this.f51679a;
        g6Var.u(i7);
        g6Var.C = (int) (f10 * 255.0f);
        g6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g6Var.draw(canvas);
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
        return (int) (this.f51679a.d + org.telegram.messenger.g0.L(11.0f));
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
