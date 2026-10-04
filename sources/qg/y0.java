package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.oa;
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final oa f45420l2;
    public final TextPaint f45421m2;
    public final a1 f45422n2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f45422n2 = a1Var;
        this.f45420l2 = new oa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f45421m2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint F(String str) {
        float f7;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                b6 b6Var = this.f45422n2.h;
                b6Var.f45011v0 = true;
                boolean z10 = b6Var.B0;
                oa oaVar = this.f45420l2;
                if (oaVar.f29319r != z10) {
                    oaVar.f29319r = z10;
                    if (oaVar.f29310i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (oaVar.f29319r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (oaVar.f29319r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        oaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        oaVar.f29309g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = oaVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.F(str);
        }
        return this.f45421m2;
    }
}
