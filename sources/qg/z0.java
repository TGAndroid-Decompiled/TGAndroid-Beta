package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ma;
public final class z0 extends org.telegram.ui.Cells.w0 {
    public final ma f42052l2;
    public final TextPaint f42053m2;
    public final b1 f42054n2;

    public z0(b1 b1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f42054n2 = b1Var;
        this.f42052l2 = new ma(b1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f42053m2 = textPaint;
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
                c6 c6Var = this.f42054n2.h;
                c6Var.f41669v0 = true;
                boolean z10 = c6Var.B0;
                ma maVar = this.f42052l2;
                if (maVar.f26401r != z10) {
                    maVar.f26401r = z10;
                    if (maVar.f26392i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (maVar.f26401r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (maVar.f26401r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        maVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        maVar.f26391g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = maVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.G(str);
        }
        return this.f42053m2;
    }
}
