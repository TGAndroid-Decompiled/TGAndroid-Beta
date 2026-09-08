package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import di.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.na;
public final class a1 extends org.telegram.ui.Cells.w0 {
    public final na f45140k2;
    public final TextPaint f45141l2;
    public final c1 f45142m2;

    public a1(c1 c1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f45142m2 = c1Var;
        this.f45140k2 = new na(c1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f45141l2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint H(String str) {
        float f7;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                c6 c6Var = this.f45142m2.h;
                c6Var.f45222v0 = true;
                boolean z10 = c6Var.B0;
                na naVar = this.f45140k2;
                if (naVar.f28744r != z10) {
                    naVar.f28744r = z10;
                    if (naVar.f28735i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (naVar.f28744r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (naVar.f28744r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        naVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        naVar.f28734g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = naVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.H(str);
        }
        return this.f45141l2;
    }
}
