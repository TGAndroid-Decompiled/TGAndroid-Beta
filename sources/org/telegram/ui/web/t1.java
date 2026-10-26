package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r6;
public final class t1 {
    public final r6 f45381a;
    public final r6 f45382b;
    public final h6 f45383c;
    public int d;
    public boolean e;
    public int f45384f;
    public final Drawable f45385g;
    public final org.telegram.ui.l0 h;

    public t1(org.telegram.ui.l0 l0Var) {
        this.h = l0Var;
        r6 r6Var = new r6(true, true, true);
        this.f45381a = r6Var;
        r6 r6Var2 = new r6(true, true, true);
        this.f45382b = r6Var2;
        this.f45383c = new h6(l0Var, 0L, 300L, ds.h);
        this.e = false;
        r6Var.K = true;
        r6Var.w(AndroidUtilities.dp(18.33f));
        r6Var.A = 0.6f;
        r6Var.x(AndroidUtilities.bold());
        r6Var.q(false);
        r6Var.setCallback(l0Var);
        r6Var.M = 9999999;
        r6Var2.K = true;
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.q(false);
        r6Var2.setCallback(l0Var);
        r6Var2.M = 9999999;
        this.f45385g = l0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.l0 l0Var = this.h;
        RectF rectF = l0Var.f45392a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        r6 r6Var = this.f45381a;
        float i10 = r6Var.i();
        r6 r6Var2 = this.f45382b;
        float i11 = r6Var2.i();
        TextPaint textPaint = r6Var2.f32119a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, c3.h0.z(1.0f, l0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * l0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        r6Var.o(0.0f, 0.0f, f7, f10);
        r6Var.draw(canvas);
        canvas.restore();
        float e = this.f45383c.e(this.e);
        canvas.save();
        float f14 = ((1.0f - l0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f));
        canvas.translate(0.0f, ic.a.d(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + f14));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * l0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        r6Var2.u(i0.a.f(e, this.d, y6.x0(null, y6.f23598q7, false)));
        if (e > 0.0f) {
            int i12 = this.f45384f;
            int color = textPaint.getColor();
            Drawable drawable = this.f45385g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f45384f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        r6Var2.o(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        r6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        l0Var.f45414r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
