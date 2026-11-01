package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
public final class u7 extends ReplacementSpan {
    public View f49544a;
    public float d;
    public boolean e;
    public long f49547f;
    public boolean f49548n;
    public boolean f49549r;
    public int f49545b = 1;
    public int f49546c = 2;
    public final gr h = new gr(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i10;
        int i11;
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        int i12 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == 8230) {
                i11 = 1;
            } else {
                i11 = (str.charAt(i12) == '.' && (i10 = i12 + 2) < str.length() && str.charAt(i12 + 1) == '.' && str.charAt(i10) == '.') ? 3 : 3;
                i12++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            u7 u7Var = new u7();
            u7Var.f49544a = textView;
            u7Var.f49548n = false;
            spannableStringBuilder.setSpan(u7Var, i12, i12 + i11, 33);
            i12 += i11 - 1;
            i12++;
        }
        if (spannableStringBuilder == null) {
            return str;
        }
        return spannableStringBuilder;
    }

    public final void b(org.telegram.ui.Cells.s0 s0Var) {
        this.f49544a = s0Var;
        this.f49548n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        float f11;
        float f12;
        float y3;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f49549r) {
            f10 = textPaint.getFontMetrics().ascent;
        } else {
            f10 = textPaint.getFontMetrics().top;
        }
        float f13 = -f10;
        float f14 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f49548n) {
            f11 = 0.05f;
        } else {
            f11 = 0.0365f;
        }
        float f15 = f14 * f11;
        float f16 = f13 - f15;
        if (this.e) {
            if (System.currentTimeMillis() - this.f49547f > 1000) {
                this.e = false;
            }
        } else {
            float f17 = this.d + 0.053333335f;
            this.d = f17;
            if (f17 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f49545b - 1;
                this.f49545b = i15;
                this.f49546c--;
                if (i15 < 0) {
                    this.f49545b = 1;
                    this.f49546c = 2;
                    this.e = true;
                    this.f49547f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f18 = measureText / 2.0f;
            float f19 = (i16 * measureText) + f7 + f18;
            if (i16 == this.f49545b) {
                f19 = org.telegram.messenger.i0.T1(f19, sc.e.d(measureText, i16 + 1, f7, f18), this.d);
                float f20 = this.d;
                if (f20 < 0.5f) {
                    y3 = f20 / 0.5f;
                } else {
                    y3 = org.telegram.messenger.m5.y(f20, 0.5f, 0.5f, 1.0f);
                }
                f12 = org.telegram.messenger.i0.T1(f16, f16 - f18, this.h.getInterpolation(y3));
            } else {
                if (i16 == this.f49546c) {
                    f19 = org.telegram.messenger.i0.T1(f19, sc.e.d(measureText, i16 - 1, f7, f18), this.d);
                }
                f12 = f16;
            }
            canvas.drawCircle(f19, f12, f15, paint);
        }
        View view = this.f49544a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
