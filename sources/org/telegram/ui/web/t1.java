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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.p6;
public final class t1 {
    public final p6 f43258a;
    public final p6 f43259b;
    public final f6 f43260c;
    public int d;
    public boolean e;
    public int f43261f;
    public final Drawable f43262g;
    public final org.telegram.ui.m0 h;

    public t1(org.telegram.ui.m0 m0Var) {
        this.h = m0Var;
        p6 p6Var = new p6(true, true, true);
        this.f43258a = p6Var;
        p6 p6Var2 = new p6(true, true, true);
        this.f43259b = p6Var2;
        this.f43260c = new f6(m0Var, 0L, 300L, bs.h);
        this.e = false;
        p6Var.K = true;
        p6Var.w(AndroidUtilities.dp(18.33f));
        p6Var.A = 0.6f;
        p6Var.x(AndroidUtilities.bold());
        p6Var.q(false);
        p6Var.setCallback(m0Var);
        p6Var.M = 9999999;
        p6Var2.K = true;
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.q(false);
        p6Var2.setCallback(m0Var);
        p6Var2.M = 9999999;
        this.f43262g = m0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.m0 m0Var = this.h;
        RectF rectF = m0Var.f43268a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        p6 p6Var = this.f43258a;
        float i10 = p6Var.i();
        p6 p6Var2 = this.f43259b;
        float i11 = p6Var2.i();
        TextPaint textPaint = p6Var2.f29435a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, k3.y(1.0f, m0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * m0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        p6Var.o(0.0f, 0.0f, f7, f10);
        p6Var.draw(canvas);
        canvas.restore();
        float e = this.f43260c.e(this.e);
        canvas.save();
        float f14 = ((1.0f - m0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, k3.D(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * m0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        p6Var2.u(i0.a.f(e, this.d, k6.x0(null, k6.f21421q7, false)));
        if (e > 0.0f) {
            int i12 = this.f43261f;
            int color = textPaint.getColor();
            Drawable drawable = this.f43262g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f43261f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        p6Var2.o(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        p6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        m0Var.f43290r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
