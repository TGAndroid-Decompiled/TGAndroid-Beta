package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import fi.e5;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ba;
public final class q0 extends org.telegram.ui.Cells.t0 {
    public final ba f55916t2;
    public final TextPaint f55917u2;
    public final s0 f55918v2;

    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.f55918v2 = s0Var;
        this.f55916t2 = new ba(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f55917u2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint N(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                e5 e5Var = this.f55918v2.h;
                e5Var.f55978v0 = true;
                boolean z9 = e5Var.B0;
                ba baVar = this.f55916t2;
                if (baVar.f32189r != z9) {
                    baVar.f32189r = z9;
                    if (baVar.f32180i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (baVar.f32189r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (baVar.f32189r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        baVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        baVar.f32179g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = baVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.N(str);
        }
        return this.f55917u2;
    }
}
