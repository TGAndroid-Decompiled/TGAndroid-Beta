package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.y5;
public final class p1 {
    public final i6 f43959a;
    public final i6 f43960b;
    public final y5 f43961c;
    public int d;
    public boolean f43962e;
    public int f43963f;
    public final Drawable f43964g;
    public final org.telegram.ui.n0 h;

    public p1(org.telegram.ui.n0 n0Var) {
        this.h = n0Var;
        i6 i6Var = new i6(true, true, true, false);
        this.f43959a = i6Var;
        i6 i6Var2 = new i6(true, true, true, false);
        this.f43960b = i6Var2;
        this.f43961c = new y5(n0Var, 0L, 300L, gr.h);
        this.f43962e = false;
        i6Var.E = true;
        i6Var.t(AndroidUtilities.dp(18.33f));
        i6Var.v = 0.6f;
        i6Var.u(AndroidUtilities.bold());
        i6Var.n(false);
        i6Var.setCallback(n0Var);
        i6Var.G = 9999999;
        i6Var2.E = true;
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.n(false);
        i6Var2.setCallback(n0Var);
        i6Var2.G = 9999999;
        this.f43964g = n0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        org.telegram.ui.n0 n0Var = this.h;
        RectF rectF = n0Var.f43970a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        i6 i6Var = this.f43959a;
        float g10 = i6Var.g();
        i6 i6Var2 = this.f43960b;
        float g11 = i6Var2.g();
        TextPaint textPaint = i6Var2.f29332a;
        float f13 = g11 * g10;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, e2.c.z(1.0f, n0Var.C, f14, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f13);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f13) * n0Var.C;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        i6Var.l(0.0f, 0.0f, f10, f11);
        i6Var.draw(canvas);
        canvas.restore();
        float e10 = this.f43961c.e(this.f43962e);
        canvas.save();
        float f15 = ((1.0f - n0Var.C) * f14 * f13) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, j3.r0.C(1.0f, f13, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f13) + f15));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f13) * n0Var.C;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        i6Var2.r(i0.a.d(e10, this.d, f6.w0(null, f6.f23230q7, false)));
        if (e10 > 0.0f) {
            int i9 = this.f43963f;
            int color = textPaint.getColor();
            Drawable drawable = this.f43964g;
            if (i9 != color) {
                int color2 = textPaint.getColor();
                this.f43963f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e10 * 255.0f));
            drawable.setBounds(0, ((int) (f11 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        i6Var2.l(AndroidUtilities.dp(20.0f) * e10, 0.0f, f10, f11);
        i6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - AndroidUtilities.dp(12.0f), 0.0f, f10, f11);
        n0Var.f43988n0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
