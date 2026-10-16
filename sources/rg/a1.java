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
public final class a1 extends org.telegram.ui.Cells.w0 {
    public final pa f43946t2;
    public final TextPaint f43947u2;
    public final c1 f43948v2;

    public a1(c1 c1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.f43948v2 = c1Var;
        this.f43946t2 = new pa(c1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f43947u2 = textPaint;
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
                a6 a6Var = this.f43948v2.h;
                a6Var.f44022v0 = true;
                boolean z10 = a6Var.B0;
                pa paVar = this.f43946t2;
                if (paVar.f27952r != z10) {
                    paVar.f27952r = z10;
                    if (paVar.f27943i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (paVar.f27952r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (paVar.f27952r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        paVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        paVar.f27942g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = paVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.I(str);
        }
        return this.f43947u2;
    }
}
