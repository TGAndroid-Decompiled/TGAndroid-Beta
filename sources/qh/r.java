package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r extends ReplacementSpan {
    public static final int h = 0;
    public final String f46640a;
    public final Bitmap f46641b;
    public final int f46642c;
    public final int d;
    public final int f46643e;
    public final Paint f46644f;

    public r(String str, Bitmap bitmap, int i9, int i10, int i11, int i12) {
        Paint paint = new Paint(3);
        this.f46644f = paint;
        this.f46640a = str;
        this.f46641b = bitmap;
        this.f46642c = i9;
        this.d = i10;
        this.f46643e = i12;
        paint.setColor(i11);
    }

    public static r a(String str, int i9, float f10) {
        q a2;
        if (str != null && !str.isEmpty() && (a2 = q.a(str, f10, true)) != null) {
            return new r(str, a2.f46618a, a2.f46619b, a2.f46620c, i9, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Bitmap bitmap = this.f46641b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f46644f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i12 - (this.d - this.f46643e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i11 = this.d;
            int i12 = this.f46643e;
            int i13 = -(i11 - i12);
            fontMetricsInt.ascent = i13;
            fontMetricsInt.top = i13;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return this.f46642c;
    }
}
