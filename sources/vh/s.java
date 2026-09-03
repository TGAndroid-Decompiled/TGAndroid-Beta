package vh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class s extends ReplacementSpan {
    public static final int h = 0;
    public final String f46197a;
    public final Bitmap f46198b;
    public final int f46199c;
    public final int d;
    public final int e;
    public final Paint f46200f;

    public s(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f46200f = paint;
        this.f46197a = str;
        this.f46198b = bitmap;
        this.f46199c = i10;
        this.d = i11;
        this.e = i13;
        paint.setColor(i12);
    }

    public static s a(String str, int i10, float f10) {
        r a2;
        if (str != null && !str.isEmpty() && (a2 = r.a(str, f10, true)) != null) {
            return new s(str, a2.f46172a, a2.f46173b, a2.f46174c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f46198b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f46200f;
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
        return this.f46199c;
    }
}
