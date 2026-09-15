package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.la;
public final class b1 extends org.telegram.ui.Cells.w0 {
    public final la f41308k2;
    public final TextPaint f41309l2;
    public final d1 f41310m2;

    public b1(d1 d1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f41310m2 = d1Var;
        this.f41308k2 = new la(d1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f41309l2 = textPaint;
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
                c6 c6Var = this.f41310m2.h;
                c6Var.f41375v0 = true;
                boolean z10 = c6Var.B0;
                la laVar = this.f41308k2;
                if (laVar.f25896r != z10) {
                    laVar.f25896r = z10;
                    if (laVar.f25887i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (laVar.f25896r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (laVar.f25896r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        laVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        laVar.f25886g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = laVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.H(str);
        }
        return this.f41309l2;
    }
}
