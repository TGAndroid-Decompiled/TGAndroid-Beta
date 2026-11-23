package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.l5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.fa;
public final class v0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final x0 B2;
    public final fa f58267z2;

    public v0(x0 x0Var, Context context, y0 y0Var) {
        super(context, y0Var, false);
        this.B2 = x0Var;
        this.f58267z2 = new fa(x0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint S(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                l5 l5Var = this.B2.h;
                l5Var.f58317x0 = true;
                boolean z10 = l5Var.D0;
                fa faVar = this.f58267z2;
                if (faVar.f35079r != z10) {
                    faVar.f35079r = z10;
                    if (faVar.f35070i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (faVar.f35079r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (faVar.f35079r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        faVar.f35069g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = faVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.S(str);
        }
        return this.A2;
    }
}
