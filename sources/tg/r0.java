package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.a5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ga;
public final class r0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final t0 B2;
    public final ga f58150z2;

    public r0(t0 t0Var, Context context, u0 u0Var) {
        super(context, u0Var, false);
        this.B2 = t0Var;
        this.f58150z2 = new ga(t0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint P(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                a5 a5Var = this.B2.h;
                a5Var.f58201w0 = true;
                boolean z10 = a5Var.C0;
                ga gaVar = this.f58150z2;
                if (gaVar.f35483r != z10) {
                    gaVar.f35483r = z10;
                    if (gaVar.f35474i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (gaVar.f35483r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (gaVar.f35483r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        gaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        gaVar.f35473g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
