package wg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.ui.ActionBar.k6;
public final class e1 extends ReplacementSpan {
    public final TextPaint f57630a;
    public final Paint f57631b;
    public final RectF f57632c;
    public final boolean d;

    public e1(int i7, boolean z9) {
        TextPaint textPaint = new TextPaint(1);
        this.f57630a = textPaint;
        Paint paint = new Paint(1);
        this.f57631b = paint;
        this.f57632c = new RectF();
        this.d = z9;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(i7);
        paint.setColor(k6.r1(0.08f, i7));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = this.f57630a;
        float measureText = textPaint.measureText(charSequence, i7, i10);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = this.f57632c;
        rectF.set(f10, f11 - org.telegram.messenger.g0.L(9.5f), f10 + measureText + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.5f) + f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f57631b);
        if (this.d) {
            int color = textPaint.getColor();
            int r12 = k6.r1(0.0f, color);
            float L = f10 + org.telegram.messenger.g0.L(4.0f);
            textPaint.setShader(new LinearGradient(L, 0.0f, L + measureText, 0.0f, new int[]{color, r12, r12, color}, new float[]{0.17f, 0.41f, 0.59f, 0.87f}, Shader.TileMode.CLAMP));
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(charSequence, i7, i10, f10 + org.telegram.messenger.g0.L(4.0f), f11 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setShader(null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return org.telegram.messenger.g0.L(11.0f) + ((int) Math.ceil(this.f57630a.measureText(charSequence, i7, i10)));
    }
}
