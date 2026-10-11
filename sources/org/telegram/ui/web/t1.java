package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q6;
public final class t1 {
    public final q6 f43687a;
    public final q6 f43688b;
    public final g6 f43689c;
    public int d;
    public boolean f43690e;
    public int f43691f;
    public final Drawable f43692g;
    public final org.telegram.ui.k0 h;

    public t1(org.telegram.ui.k0 k0Var) {
        this.h = k0Var;
        q6 q6Var = new q6(true, true, true);
        this.f43687a = q6Var;
        q6 q6Var2 = new q6(true, true, true);
        this.f43688b = q6Var2;
        this.f43689c = new g6(k0Var, 0L, 300L, is.h);
        this.f43690e = false;
        q6Var.K = true;
        q6Var.w(AndroidUtilities.dp(18.33f));
        q6Var.A = 0.6f;
        q6Var.x(AndroidUtilities.bold());
        q6Var.q(false);
        q6Var.setCallback(k0Var);
        q6Var.M = 9999999;
        q6Var2.K = true;
        q6Var2.w(AndroidUtilities.dp(14.0f));
        q6Var2.q(false);
        q6Var2.setCallback(k0Var);
        q6Var2.M = 9999999;
        this.f43692g = k0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.k0 k0Var = this.h;
        RectF rectF = k0Var.f43698a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        q6 q6Var = this.f43687a;
        float i10 = q6Var.i();
        q6 q6Var2 = this.f43688b;
        float i11 = q6Var2.i();
        TextPaint textPaint = q6Var2.f30132a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.y(1.0f, k0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * k0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        q6Var.o(0.0f, 0.0f, f7, f10);
        q6Var.draw(canvas);
        canvas.restore();
        float e7 = this.f43689c.e(this.f43690e);
        canvas.save();
        float f14 = ((1.0f - k0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * k0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        q6Var2.u(i0.a.d(e7, this.d, h6.x0(null, h6.f21062q7, false)));
        if (e7 > 0.0f) {
            int i12 = this.f43691f;
            int color = textPaint.getColor();
            Drawable drawable = this.f43692g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f43691f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e7 * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        q6Var2.o(AndroidUtilities.dp(20.0f) * e7, 0.0f, f7, f10);
        q6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        k0Var.f43721r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
