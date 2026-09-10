package pg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import bi.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ma;
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final ma f40372k2;
    public final TextPaint f40373l2;
    public final a1 f40374m2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.f40374m2 = a1Var;
        this.f40372k2 = new ma(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f40373l2 = textPaint;
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
                b7 b7Var = this.f40374m2.h;
                b7Var.f39987v0 = true;
                boolean z10 = b7Var.B0;
                ma maVar = this.f40372k2;
                if (maVar.f25211r != z10) {
                    maVar.f25211r = z10;
                    if (maVar.f25202i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (maVar.f25211r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f7);
                        if (maVar.f25211r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        maVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        maVar.f25201g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = maVar.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.H(str);
        }
        return this.f40373l2;
    }
}
