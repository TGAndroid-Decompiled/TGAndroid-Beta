package rh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public final class r extends ReplacementSpan {
    public static final int h = 0;

    public final String f47398a;

    public final Bitmap f47399b;

    public final int f47400c;
    public final int d;

    public final int f47401e;

    public final Paint f47402f;

    public r(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f47402f = paint;
        this.f47398a = str;
        this.f47399b = bitmap;
        this.f47400c = i10;
        this.d = i11;
        this.f47401e = i13;
        paint.setColor(i12);
    }

    public static r a(String str, int i10, float f10) {
        q qVarA;
        if (str == null || str.isEmpty() || (qVarA = q.a(str, f10, true)) == null) {
            return null;
        }
        return new r(str, qVarA.f47381a, qVarA.f47382b, qVarA.f47383c, i10, qVarA.d);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f47399b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f47402f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i13 - (this.d - this.f47401e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.f47401e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f47400c;
    }
}
