package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
public final class v1 {
    public final o6 f39062a;
    public final o6 f39063b;
    public final e6 f39064c;
    public int d;
    public boolean e;
    public int f39065f;
    public final Drawable f39066g;
    public final org.telegram.ui.k0 h;

    public v1(org.telegram.ui.k0 k0Var) {
        this.h = k0Var;
        o6 o6Var = new o6(true, true, true, false);
        this.f39062a = o6Var;
        o6 o6Var2 = new o6(true, true, true, false);
        this.f39063b = o6Var2;
        this.f39064c = new e6(k0Var, 0L, 300L, qr.h);
        this.e = false;
        o6Var.E = true;
        o6Var.t(AndroidUtilities.dp(18.33f));
        o6Var.v = 0.6f;
        o6Var.u(AndroidUtilities.bold());
        o6Var.n(false);
        o6Var.setCallback(k0Var);
        o6Var.G = 9999999;
        o6Var2.E = true;
        o6Var2.t(AndroidUtilities.dp(14.0f));
        o6Var2.n(false);
        o6Var2.setCallback(k0Var);
        o6Var2.G = 9999999;
        this.f39066g = k0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.k0 k0Var = this.h;
        RectF rectF = k0Var.f39074a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        o6 o6Var = this.f39062a;
        float g10 = o6Var.g();
        o6 o6Var2 = this.f39063b;
        float g11 = o6Var2.g();
        TextPaint textPaint = o6Var2.f26867a;
        float f12 = g11 * g10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, k0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * k0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        o6Var.l(0.0f, 0.0f, f7, f10);
        o6Var.draw(canvas);
        canvas.restore();
        float e = this.f39064c.e(this.e);
        canvas.save();
        float f14 = ((1.0f - k0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * k0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        o6Var2.r(i0.a.d(e, this.d, j6.w0(null, j6.f19301q7, false)));
        if (e > 0.0f) {
            int i10 = this.f39065f;
            int color = textPaint.getColor();
            Drawable drawable = this.f39066g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f39065f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        o6Var2.l(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        o6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        k0Var.f39096r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
