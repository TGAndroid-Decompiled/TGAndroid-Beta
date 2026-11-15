package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.c5;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.y9;
public final class q0 extends org.telegram.ui.Cells.t0 {
    public final y9 f57521u2;
    public final TextPaint f57522v2;
    public final s0 f57523w2;

    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.f57523w2 = s0Var;
        this.f57521u2 = new y9(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f57522v2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint R(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                c5 c5Var = this.f57523w2.h;
                c5Var.f57575w0 = true;
                boolean z10 = c5Var.C0;
                y9 y9Var = this.f57521u2;
                if (y9Var.f41954r != z10) {
                    y9Var.f41954r = z10;
                    if (y9Var.f41945i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (y9Var.f41954r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (y9Var.f41954r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        y9Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        y9Var.f41944g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = y9Var.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.R(str);
        }
        return this.f57522v2;
    }
}
