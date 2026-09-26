package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 extends ReplacementSpan {
    public final String f39356a;
    public final boolean f39357b;
    public final TextPaint f39358c;
    public final Paint d;
    public final float e;
    public final yg0 f39359f;

    public wg0(yg0 yg0Var, int i10, boolean z10) {
        this.f39359f = yg0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f39358c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.f39356a = valueOf;
        this.f39357b = z10;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(valueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float dp = f7 + AndroidUtilities.dp(5.0f);
        float dp2 = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        if (this.f39357b) {
            i15 = org.telegram.ui.ActionBar.h6.Oh;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.U9;
        }
        yg0 yg0Var = this.f39359f;
        int themedColor = yg0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = yg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19337s8);
        TextPaint textPaint = this.f39358c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.e;
        rectF.set(dp, dp2 - dp3, dp + f10, dp2 + dp3);
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f11 = dp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f39356a;
        canvas.drawText(str, ((f10 - textPaint.measureText(str)) / 2.0f) + dp, f11, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.e);
    }
}
