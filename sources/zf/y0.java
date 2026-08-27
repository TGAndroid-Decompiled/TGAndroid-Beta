package zf;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.da;

public final class y0 extends org.telegram.ui.Cells.v0 {

    public final da f50777g2;

    public final TextPaint f50778h2;

    public final a1 f50779i2;

    public y0(a1 a1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.f50779i2 = a1Var;
        this.f50777g2 = new da(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f50778h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint H(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.f50778h2;
        }
        if ("paintChatActionBackground".equals(str)) {
            r5 r5Var = this.f50779i2.h;
            r5Var.f50392r0 = true;
            boolean z10 = r5Var.f50398x0;
            da daVar = this.f50777g2;
            if (daVar.f27698r != z10) {
                daVar.f27698r = z10;
                if (daVar.f27689i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, daVar.f27698r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, daVar.f27698r ? 0.12f : -0.06f);
                    daVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    daVar.f27688g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint paintC = daVar.c(1.0f);
            if (paintC != null) {
                return paintC;
            }
        }
        return super.H(str);
    }
}
