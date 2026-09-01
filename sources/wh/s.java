package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class s extends ReplacementSpan {
    public static final int h = 0;
    public final String f50019a;
    public final Bitmap f50020b;
    public final int f50021c;
    public final int d;
    public final int f50022e;
    public final Paint f50023f;

    public s(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f50023f = paint;
        this.f50019a = str;
        this.f50020b = bitmap;
        this.f50021c = i10;
        this.d = i11;
        this.f50022e = i13;
        paint.setColor(i12);
    }

    public static s a(String str, int i10, float f10) {
        r a2;
        if (str != null && !str.isEmpty() && (a2 = r.a(str, f10, true)) != null) {
            return new s(str, a2.f49958a, a2.f49959b, a2.f49960c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f50020b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f50023f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i13 - (this.d - this.f50022e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.f50022e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f50021c;
    }
}
