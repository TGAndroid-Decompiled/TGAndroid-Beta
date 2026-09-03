package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class s extends ReplacementSpan {
    public static final int h = 0;
    public final String f50055a;
    public final Bitmap f50056b;
    public final int f50057c;
    public final int d;
    public final int f50058e;
    public final Paint f50059f;

    public s(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f50059f = paint;
        this.f50055a = str;
        this.f50056b = bitmap;
        this.f50057c = i10;
        this.d = i11;
        this.f50058e = i13;
        paint.setColor(i12);
    }

    public static s a(String str, int i10, float f10) {
        r a2;
        if (str != null && !str.isEmpty() && (a2 = r.a(str, f10, true)) != null) {
            return new s(str, a2.f49994a, a2.f49995b, a2.f49996c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f50056b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f50059f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i13 - (this.d - this.f50058e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.f50058e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f50057c;
    }
}
