package th;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r extends ReplacementSpan {
    public static final int h = 0;
    public final String f48696a;
    public final Bitmap f48697b;
    public final int f48698c;
    public final int d;
    public final int f48699e;
    public final Paint f48700f;

    public r(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f48700f = paint;
        this.f48696a = str;
        this.f48697b = bitmap;
        this.f48698c = i10;
        this.d = i11;
        this.f48699e = i13;
        paint.setColor(i12);
    }

    public static r a(String str, int i10, float f9) {
        q a2;
        if (str != null && !str.isEmpty() && (a2 = q.a(str, f9, true)) != null) {
            return new r(str, a2.f48679a, a2.f48680b, a2.f48681c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f48697b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f48700f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f9, i13 - (this.d - this.f48699e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.f48699e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f48698c;
    }
}
