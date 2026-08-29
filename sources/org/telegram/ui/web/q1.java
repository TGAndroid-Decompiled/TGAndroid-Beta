package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.th;
public final class q1 {
    public final n6 f44149a;
    public final n6 f44150b;
    public final d6 f44151c;
    public int d;
    public boolean f44152e;
    public int f44153f;
    public final Drawable f44154g;
    public final org.telegram.ui.o0 h;

    public q1(org.telegram.ui.o0 o0Var) {
        this.h = o0Var;
        n6 n6Var = new n6(true, true, true, false);
        this.f44149a = n6Var;
        n6 n6Var2 = new n6(true, true, true, false);
        this.f44150b = n6Var2;
        this.f44151c = new d6(o0Var, 0L, 300L, jr.h);
        this.f44152e = false;
        n6Var.E = true;
        n6Var.t(AndroidUtilities.dp(18.33f));
        n6Var.v = 0.6f;
        n6Var.u(AndroidUtilities.bold());
        n6Var.n(false);
        n6Var.setCallback(o0Var);
        n6Var.G = 9999999;
        n6Var2.E = true;
        n6Var2.t(AndroidUtilities.dp(14.0f));
        n6Var2.n(false);
        n6Var2.setCallback(o0Var);
        n6Var2.G = 9999999;
        this.f44154g = o0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f9, float f10, float f11) {
        org.telegram.ui.o0 o0Var = this.h;
        RectF rectF = o0Var.f44160a;
        rectF.set(0.0f, 0.0f, f9, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        n6 n6Var = this.f44149a;
        float g10 = n6Var.g();
        n6 n6Var2 = this.f44150b;
        float g11 = n6Var2.g();
        TextPaint textPaint = n6Var2.f30861a;
        float f12 = g11 * g10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, o0Var.C, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * o0Var.C;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        n6Var.l(0.0f, 0.0f, f9, f10);
        n6Var.draw(canvas);
        canvas.restore();
        float e10 = this.f44151c.e(this.f44152e);
        canvas.save();
        float f14 = ((1.0f - o0Var.C) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, th.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * o0Var.C;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        n6Var2.r(i0.a.d(e10, this.d, g6.w0(null, g6.f23295q7, false)));
        if (e10 > 0.0f) {
            int i10 = this.f44153f;
            int color = textPaint.getColor();
            Drawable drawable = this.f44154g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f44153f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e10 * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        n6Var2.l(AndroidUtilities.dp(20.0f) * e10, 0.0f, f9, f10);
        n6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f9 - AndroidUtilities.dp(12.0f), 0.0f, f9, f10);
        o0Var.f44178n0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
