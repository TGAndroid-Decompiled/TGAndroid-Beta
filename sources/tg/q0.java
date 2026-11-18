package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ga;
public final class q0 extends org.telegram.ui.Cells.u0 {
    public final ga C2;
    public final TextPaint D2;
    public final s0 E2;

    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.E2 = s0Var;
        this.C2 = new ga(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.D2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint R(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                b5 b5Var = this.E2.h;
                b5Var.f58144w0 = true;
                boolean z10 = b5Var.C0;
                ga gaVar = this.C2;
                if (gaVar.f35447r != z10) {
                    gaVar.f35447r = z10;
                    if (gaVar.f35438i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (gaVar.f35447r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (gaVar.f35447r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        gaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        gaVar.f35437g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = gaVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.R(str);
        }
        return this.D2;
    }
}
