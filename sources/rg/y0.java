package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.la;
public final class y0 extends org.telegram.ui.Cells.v0 {
    public final la f46142t2;
    public final TextPaint f46143u2;
    public final a1 f46144v2;

    public y0(a1 a1Var, Context context, e1 e1Var) {
        super(context, e1Var, false);
        this.f46144v2 = a1Var;
        this.f46142t2 = new la(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f46143u2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint G(String str) {
        float f7;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                r5 r5Var = this.f46144v2.h;
                r5Var.f45770v0 = true;
                boolean z10 = r5Var.B0;
                la laVar = this.f46142t2;
                if (laVar.f28304r != z10) {
                    laVar.f28304r = z10;
                    if (laVar.f28295i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (laVar.f28304r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (laVar.f28304r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        laVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        laVar.f28294g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = laVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.G(str);
        }
        return this.f46143u2;
    }
}
