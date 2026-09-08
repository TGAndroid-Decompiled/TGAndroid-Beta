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
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
public final class v1 {
    public final p6 f42288a;
    public final p6 f42289b;
    public final e6 f42290c;
    public int d;
    public boolean f42291e;
    public int f42292f;
    public final Drawable f42293g;
    public final org.telegram.ui.k0 h;

    public v1(org.telegram.ui.k0 k0Var) {
        this.h = k0Var;
        p6 p6Var = new p6(true, true, true, false);
        this.f42288a = p6Var;
        p6 p6Var2 = new p6(true, true, true, false);
        this.f42289b = p6Var2;
        this.f42290c = new e6(k0Var, 0L, 300L, pr.h);
        this.f42291e = false;
        p6Var.E = true;
        p6Var.t(AndroidUtilities.dp(18.33f));
        p6Var.v = 0.6f;
        p6Var.u(AndroidUtilities.bold());
        p6Var.n(false);
        p6Var.setCallback(k0Var);
        p6Var.G = 9999999;
        p6Var2.E = true;
        p6Var2.t(AndroidUtilities.dp(14.0f));
        p6Var2.n(false);
        p6Var2.setCallback(k0Var);
        p6Var2.G = 9999999;
        this.f42293g = k0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.k0 k0Var = this.h;
        RectF rectF = k0Var.f42301a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        p6 p6Var = this.f42288a;
        float g10 = p6Var.g();
        p6 p6Var2 = this.f42289b;
        float g11 = p6Var2.g();
        TextPaint textPaint = p6Var2.f29311a;
        float f12 = g11 * g10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, k0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * k0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        p6Var.l(0.0f, 0.0f, f7, f10);
        p6Var.draw(canvas);
        canvas.restore();
        float e7 = this.f42290c.e(this.f42291e);
        canvas.save();
        float f14 = ((1.0f - k0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * k0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        p6Var2.r(i0.a.d(e7, this.d, j6.w0(null, j6.f20925q7, false)));
        if (e7 > 0.0f) {
            int i10 = this.f42292f;
            int color = textPaint.getColor();
            Drawable drawable = this.f42293g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f42292f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e7 * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        p6Var2.l(AndroidUtilities.dp(20.0f) * e7, 0.0f, f7, f10);
        p6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        k0Var.f42324r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
