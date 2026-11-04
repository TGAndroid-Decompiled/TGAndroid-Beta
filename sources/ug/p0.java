package ug;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import gi.c5;
import org.telegram.messenger.az;
import org.telegram.ui.Components.ba;
public final class p0 extends org.telegram.ui.Cells.t0 {
    public final ba f56208u2;
    public final TextPaint f56209v2;
    public final r0 f56210w2;

    public p0(r0 r0Var, Context context, s0 s0Var) {
        super(context, s0Var, false);
        this.f56210w2 = r0Var;
        this.f56208u2 = new ba(r0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f56209v2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint O(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                c5 c5Var = this.f56210w2.h;
                c5Var.f56268w0 = true;
                boolean z10 = c5Var.C0;
                ba baVar = this.f56208u2;
                if (baVar.f32139r != z10) {
                    baVar.f32139r = z10;
                    if (baVar.f32130i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (baVar.f32139r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        org.telegram.messenger.g0.n2(colorMatrix, f10);
                        if (baVar.f32139r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        org.telegram.messenger.g0.h(colorMatrix, f11);
                        baVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        baVar.f32129g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c2 = baVar.c(1.0f);
                if (c2 != null) {
                    return c2;
                }
            }
            return super.O(str);
        }
        return this.f56209v2;
    }
}
