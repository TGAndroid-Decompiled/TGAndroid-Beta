package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.zr;
public final class t1 {
    public final n6 f43247a;
    public final n6 f43248b;
    public final d6 f43249c;
    public int d;
    public boolean e;
    public int f43250f;
    public final Drawable f43251g;
    public final org.telegram.ui.m0 h;

    public t1(org.telegram.ui.m0 m0Var) {
        this.h = m0Var;
        n6 n6Var = new n6(true, true, true);
        this.f43247a = n6Var;
        n6 n6Var2 = new n6(true, true, true);
        this.f43248b = n6Var2;
        this.f43249c = new d6(m0Var, 0L, 300L, zr.h);
        this.e = false;
        n6Var.K = true;
        n6Var.w(AndroidUtilities.dp(18.33f));
        n6Var.A = 0.6f;
        n6Var.x(AndroidUtilities.bold());
        n6Var.q(false);
        n6Var.setCallback(m0Var);
        n6Var.M = 9999999;
        n6Var2.K = true;
        n6Var2.w(AndroidUtilities.dp(14.0f));
        n6Var2.q(false);
        n6Var2.setCallback(m0Var);
        n6Var2.M = 9999999;
        this.f43251g = m0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.m0 m0Var = this.h;
        RectF rectF = m0Var.f43257a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        n6 n6Var = this.f43247a;
        float i10 = n6Var.i();
        n6 n6Var2 = this.f43248b;
        float i11 = n6Var2.i();
        TextPaint textPaint = n6Var2.f28795a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, k3.y(1.0f, m0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * m0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        n6Var.o(0.0f, 0.0f, f7, f10);
        n6Var.draw(canvas);
        canvas.restore();
        float e = this.f43249c.e(this.e);
        canvas.save();
        float f14 = ((1.0f - m0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, k3.D(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * m0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        n6Var2.u(i0.a.f(e, this.d, k6.x0(null, k6.f21422q7, false)));
        if (e > 0.0f) {
            int i12 = this.f43250f;
            int color = textPaint.getColor();
            Drawable drawable = this.f43251g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f43250f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        n6Var2.o(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        n6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        m0Var.f43279r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
