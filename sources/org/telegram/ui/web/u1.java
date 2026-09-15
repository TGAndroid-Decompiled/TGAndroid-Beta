package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
public final class u1 {
    public final m6 f39096a;
    public final m6 f39097b;
    public final c6 f39098c;
    public int d;
    public boolean e;
    public int f39099f;
    public final Drawable f39100g;
    public final org.telegram.ui.k0 h;

    public u1(org.telegram.ui.k0 k0Var) {
        this.h = k0Var;
        m6 m6Var = new m6(true, true, true, false);
        this.f39096a = m6Var;
        m6 m6Var2 = new m6(true, true, true, false);
        this.f39097b = m6Var2;
        this.f39098c = new c6(k0Var, 0L, 300L, qr.h);
        this.e = false;
        m6Var.E = true;
        m6Var.t(AndroidUtilities.dp(18.33f));
        m6Var.v = 0.6f;
        m6Var.u(AndroidUtilities.bold());
        m6Var.n(false);
        m6Var.setCallback(k0Var);
        m6Var.G = 9999999;
        m6Var2.E = true;
        m6Var2.t(AndroidUtilities.dp(14.0f));
        m6Var2.n(false);
        m6Var2.setCallback(k0Var);
        m6Var2.G = 9999999;
        this.f39100g = k0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.k0 k0Var = this.h;
        RectF rectF = k0Var.f39106a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        m6 m6Var = this.f39096a;
        float g10 = m6Var.g();
        m6 m6Var2 = this.f39097b;
        float g11 = m6Var2.g();
        TextPaint textPaint = m6Var2.f26085a;
        float f12 = g11 * g10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, k0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * k0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        m6Var.l(0.0f, 0.0f, f7, f10);
        m6Var.draw(canvas);
        canvas.restore();
        float e = this.f39098c.e(this.e);
        canvas.save();
        float f14 = ((1.0f - k0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * k0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        m6Var2.r(i0.a.d(e, this.d, i6.w0(null, i6.f19074q7, false)));
        if (e > 0.0f) {
            int i10 = this.f39099f;
            int color = textPaint.getColor();
            Drawable drawable = this.f39100g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f39099f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        m6Var2.l(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        m6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        k0Var.f39128r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
