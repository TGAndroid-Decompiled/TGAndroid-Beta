package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class x01 extends Drawable implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.r6 f45439a;
    public final Paint f45440b;
    public int f45441c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.k0 f45442f;
    public org.telegram.ui.Cells.v0 h;

    public x01(String str) {
        Paint paint = new Paint(1);
        this.f45440b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f45442f = new org.telegram.ui.Cells.k0(this);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.f45439a = r6Var;
        r6Var.setCallback(new rr(1, this));
        r6Var.t(str, true, true);
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.f32142b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f45440b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f45442f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f45440b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f45441c;
        org.telegram.ui.Components.r6 r6Var = this.f45439a;
        r6Var.u(i10);
        r6Var.B = (int) (f7 * 255.0f);
        r6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        r6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f45439a.d + AndroidUtilities.dp(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
