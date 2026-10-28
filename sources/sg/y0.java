package sg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import fi.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.pa;
public final class y0 extends org.telegram.ui.Cells.v0 {
    public final pa f48622t2;
    public final TextPaint f48623u2;
    public final a1 f48624v2;

    public y0(a1 a1Var, Context context, e1 e1Var) {
        super(context, e1Var, false);
        this.f48624v2 = a1Var;
        this.f48622t2 = new pa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f48623u2 = textPaint;
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
                q5 q5Var = this.f48624v2.h;
                q5Var.f48243v0 = true;
                boolean z10 = q5Var.B0;
                pa paVar = this.f48622t2;
                if (paVar.f31548r != z10) {
                    paVar.f31548r = z10;
                    if (paVar.f31539i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (paVar.f31548r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (paVar.f31548r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        paVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        paVar.f31538g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = paVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.H(str);
        }
        return this.f48623u2;
    }
}
