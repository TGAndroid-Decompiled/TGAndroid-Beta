package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import di.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.pa;
public final class a1 extends org.telegram.ui.Cells.x0 {
    public final pa f44187t2;
    public final TextPaint f44188u2;
    public final c1 f44189v2;

    public a1(c1 c1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.f44189v2 = c1Var;
        this.f44187t2 = new pa(c1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f44188u2 = textPaint;
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
                a6 a6Var = this.f44189v2.h;
                a6Var.f44263v0 = true;
                boolean z10 = a6Var.B0;
                pa paVar = this.f44187t2;
                if (paVar.f28271r != z10) {
                    paVar.f28271r = z10;
                    if (paVar.f28262i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (paVar.f28271r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (paVar.f28271r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        paVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        paVar.f28261g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = paVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.I(str);
        }
        return this.f44188u2;
    }
}
