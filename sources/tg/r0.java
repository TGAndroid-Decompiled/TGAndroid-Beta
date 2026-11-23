package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.ga;
public final class r0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final t0 B2;
    public final ga f58119z2;

    public r0(t0 t0Var, Context context, u0 u0Var) {
        super(context, u0Var, false);
        this.B2 = t0Var;
        this.f58119z2 = new ga(t0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint P(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                b5 b5Var = this.B2.h;
                b5Var.f58170w0 = true;
                boolean z10 = b5Var.C0;
                ga gaVar = this.f58119z2;
                if (gaVar.f35464r != z10) {
                    gaVar.f35464r = z10;
                    if (gaVar.f35455i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (gaVar.f35464r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (gaVar.f35464r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        gaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        gaVar.f35454g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = gaVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.P(str);
        }
        return this.A2;
    }
}
