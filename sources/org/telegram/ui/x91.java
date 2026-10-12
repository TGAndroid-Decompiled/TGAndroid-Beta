package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x91 extends ReplacementSpan {
    public final org.telegram.ui.Components.h11 f41804a = new org.telegram.ui.Components.h11(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
    public final Paint f41805b = new Paint(1);
    public final org.telegram.ui.ActionBar.c6 f41806c;

    public x91(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41806c = c6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f41806c);
        Paint paint2 = this.f41805b;
        paint2.setColor(w02);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, dp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f7 + this.f41804a.f25473c, AndroidUtilities.dp(9.0f) + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
        this.f41804a.c(f7 + AndroidUtilities.dp(8.0f), dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(16.0f) + this.f41804a.f25473c);
    }
}
