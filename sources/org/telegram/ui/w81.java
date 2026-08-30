package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w81 extends ReplacementSpan {
    public final org.telegram.ui.Components.k01 f39371a = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
    public final Paint f39372b = new Paint(1);
    public final org.telegram.ui.ActionBar.f6 f39373c;

    public w81(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39373c = f6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f39373c);
        Paint paint2 = this.f39372b;
        paint2.setColor(v02);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, dp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f10 + this.f39371a.f26084c, AndroidUtilities.dp(9.0f) + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
        this.f39371a.c(f10 + AndroidUtilities.dp(8.0f), dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(16.0f) + this.f39371a.f26084c);
    }
}
