package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.na;
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final na f45710t2;
    public final TextPaint f45711u2;
    public final a1 f45712v2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.l lVar) {
        super(context, lVar, false);
        this.f45712v2 = a1Var;
        this.f45710t2 = new na(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f45711u2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint I(String str) {
        float f7;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                r5 r5Var = this.f45712v2.h;
                r5Var.f45338v0 = true;
                boolean z10 = r5Var.B0;
                na naVar = this.f45710t2;
                if (naVar.f28746r != z10) {
                    naVar.f28746r = z10;
                    if (naVar.f28737i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (naVar.f28746r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (naVar.f28746r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        naVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        naVar.f28736g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = naVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.I(str);
        }
        return this.f45711u2;
    }
}
