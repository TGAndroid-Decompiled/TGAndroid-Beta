package yf;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import kh.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fa;
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final fa f50182g2;
    public final TextPaint f50183h2;
    public final a1 f50184i2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.f50184i2 = a1Var;
        this.f50182g2 = new fa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f50183h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint G(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                s5 s5Var = this.f50184i2.h;
                s5Var.f49797r0 = true;
                boolean z10 = s5Var.f49803x0;
                fa faVar = this.f50182g2;
                if (faVar.f28366r != z10) {
                    faVar.f28366r = z10;
                    if (faVar.f28357i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (faVar.f28366r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f10);
                        if (faVar.f28366r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                        faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        faVar.f28356g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = faVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.G(str);
        }
        return this.f50183h2;
    }
}
