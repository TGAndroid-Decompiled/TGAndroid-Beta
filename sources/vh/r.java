package vh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r extends ReplacementSpan {
    public static final int h = 0;
    public final String f46097a;
    public final Bitmap f46098b;
    public final int f46099c;
    public final int d;
    public final int e;
    public final Paint f46100f;

    public r(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f46100f = paint;
        this.f46097a = str;
        this.f46098b = bitmap;
        this.f46099c = i10;
        this.d = i11;
        this.e = i13;
        paint.setColor(i12);
    }

    public static r a(String str, int i10, float f10) {
        q a2;
        if (str != null && !str.isEmpty() && (a2 = q.a(str, f10, true)) != null) {
            return new r(str, a2.f46075a, a2.f46076b, a2.f46077c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f46098b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f46100f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i13 - (this.d - this.e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f46099c;
    }
}
