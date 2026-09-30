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
public final class z0 extends org.telegram.ui.Cells.w0 {
    public final oa f42122l2;
    public final TextPaint f42123m2;
    public final b1 f42124n2;

    public z0(b1 b1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f42124n2 = b1Var;
        this.f42122l2 = new oa(b1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f42123m2 = textPaint;
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
                b6 b6Var = this.f42124n2.h;
                b6Var.f41733v0 = true;
                boolean z10 = b6Var.B0;
                oa oaVar = this.f42122l2;
                if (oaVar.f27044r != z10) {
                    oaVar.f27044r = z10;
                    if (oaVar.f27035i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (oaVar.f27044r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (oaVar.f27044r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        oaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        oaVar.f27034g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = oaVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.H(str);
        }
        return this.f42123m2;
    }
}
