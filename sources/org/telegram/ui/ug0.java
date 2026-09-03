package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ug0 extends ReplacementSpan {
    public final String f41823a;
    public final boolean f41824b;
    public final TextPaint f41825c;
    public final Paint d;
    public final float f41826e;
    public final wg0 f41827f;

    public ug0(wg0 wg0Var, int i10, boolean z4) {
        this.f41827f = wg0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f41825c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.f41823a = valueOf;
        this.f41824b = z4;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f41826e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(valueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15;
        float dp = f10 + AndroidUtilities.dp(5.0f);
        float dp2 = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        if (this.f41824b) {
            i15 = org.telegram.ui.ActionBar.k6.Oh;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.U9;
        }
        wg0 wg0Var = this.f41827f;
        int themedColor = wg0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21932s8);
        TextPaint textPaint = this.f41825c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f41826e;
        rectF.set(dp, dp2 - dp3, dp + f11, dp2 + dp3);
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = dp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f41823a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + dp, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.f41826e);
    }
}
