package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.pa;
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final pa f46713t2;
    public final TextPaint f46714u2;
    public final a1 f46715v2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f46715v2 = a1Var;
        this.f46713t2 = new pa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f46714u2 = textPaint;
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
                b6 b6Var = this.f46715v2.h;
                b6Var.f46312v0 = true;
                boolean z10 = b6Var.B0;
                pa paVar = this.f46713t2;
                if (paVar.f29701r != z10) {
                    paVar.f29701r = z10;
                    if (paVar.f29692i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (paVar.f29701r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (paVar.f29701r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        paVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        paVar.f29691g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = paVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.I(str);
        }
        return this.f46714u2;
    }
}
