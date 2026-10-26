package vg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
public final class m1 extends ReplacementSpan {
    public final TextPaint f50204a;
    public final Paint f50205b;
    public final RectF f50206c;
    public final boolean d;

    public m1(int i10, boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        this.f50204a = textPaint;
        Paint paint = new Paint(1);
        this.f50205b = paint;
        this.f50206c = new RectF();
        this.d = z10;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(i10);
        paint.setColor(y6.o1(0.08f, i10));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = this.f50204a;
        float measureText = textPaint.measureText(charSequence, i10, i11);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = this.f50206c;
        rectF.set(f7, f10 - AndroidUtilities.dp(9.5f), f7 + measureText + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.5f) + f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f50205b);
        if (this.d) {
            int color = textPaint.getColor();
            int o12 = y6.o1(0.0f, color);
            float dp = f7 + AndroidUtilities.dp(4.0f);
            textPaint.setShader(new LinearGradient(dp, 0.0f, dp + measureText, 0.0f, new int[]{color, o12, o12, color}, new float[]{0.17f, 0.41f, 0.59f, 0.87f}, Shader.TileMode.CLAMP));
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(charSequence, i10, i11, f7 + AndroidUtilities.dp(4.0f), f10 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setShader(null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return AndroidUtilities.dp(11.0f) + ((int) Math.ceil(this.f50204a.measureText(charSequence, i10, i11)));
    }
}
