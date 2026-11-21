package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class xw0 extends Drawable implements org.telegram.ui.ActionBar.l5 {
    public final org.telegram.ui.Components.n6 f53974a;
    public final Paint f53975b;
    public int f53976c;
    public float d;
    public float f53977e;
    public final org.telegram.ui.Cells.k0 f53978f;
    public org.telegram.ui.Cells.v0 h;

    public xw0(String str) {
        Paint paint = new Paint(1);
        this.f53975b = paint;
        this.d = 1.0f;
        this.f53977e = 1.0f;
        this.f53978f = new org.telegram.ui.Cells.k0(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false);
        this.f53974a = n6Var;
        n6Var.setCallback(new wq(1, this));
        n6Var.t(str, true, true);
        n6Var.w(org.telegram.messenger.g0.L(11.0f));
        n6Var.f37791b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i7) {
        Paint paint = this.f53975b;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f53977e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f53978f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.f53975b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i7 = this.f53976c;
        org.telegram.ui.Components.n6 n6Var = this.f53974a;
        n6Var.u(i7);
        n6Var.C = (int) (f10 * 255.0f);
        n6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
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
        return (int) (this.f53974a.d + org.telegram.messenger.g0.L(11.0f));
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
