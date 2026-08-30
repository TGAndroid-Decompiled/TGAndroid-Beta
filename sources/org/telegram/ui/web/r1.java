package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z5;
import org.telegram.ui.yh;
public final class r1 {
    public final j6 f39618a;
    public final j6 f39619b;
    public final z5 f39620c;
    public int d;
    public boolean e;
    public int f39621f;
    public final Drawable f39622g;
    public final org.telegram.ui.m0 h;

    public r1(org.telegram.ui.m0 m0Var) {
        this.h = m0Var;
        j6 j6Var = new j6(true, true, true, false);
        this.f39618a = j6Var;
        j6 j6Var2 = new j6(true, true, true, false);
        this.f39619b = j6Var2;
        this.f39620c = new z5(m0Var, 0L, 300L, nr.h);
        this.e = false;
        j6Var.E = true;
        j6Var.t(AndroidUtilities.dp(18.33f));
        j6Var.v = 0.6f;
        j6Var.u(AndroidUtilities.bold());
        j6Var.n(false);
        j6Var.setCallback(m0Var);
        j6Var.G = 9999999;
        j6Var2.E = true;
        j6Var2.t(AndroidUtilities.dp(14.0f));
        j6Var2.n(false);
        j6Var2.setCallback(m0Var);
        j6Var2.G = 9999999;
        this.f39622g = m0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        org.telegram.ui.m0 m0Var = this.h;
        RectF rectF = m0Var.f39627a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        j6 j6Var = this.f39618a;
        float g10 = j6Var.g();
        j6 j6Var2 = this.f39619b;
        float g11 = j6Var2.g();
        TextPaint textPaint = j6Var2.f25883a;
        float f13 = g11 * g10;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, e2.c.w(1.0f, m0Var.D, f14, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f13);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f13) * m0Var.D;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        j6Var.l(0.0f, 0.0f, f10, f11);
        j6Var.draw(canvas);
        canvas.restore();
        float e = this.f39620c.e(this.e);
        canvas.save();
        float f15 = ((1.0f - m0Var.D) * f14 * f13) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, yh.c(1.0f, f13, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f13) + f15));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f13) * m0Var.D;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        j6Var2.r(i0.a.d(e, this.d, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false)));
        if (e > 0.0f) {
            int i10 = this.f39621f;
            int color = textPaint.getColor();
            Drawable drawable = this.f39622g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f39621f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f11 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        j6Var2.l(AndroidUtilities.dp(20.0f) * e, 0.0f, f10, f11);
        j6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - AndroidUtilities.dp(12.0f), 0.0f, f10, f11);
        m0Var.f39645o0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
