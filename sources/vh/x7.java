package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class x7 extends ImageSpan {
    public final Drawable f52192a;

    public x7(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.f52192a = drawable2;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(1.0f) + ((i14 - i12) / 2));
        this.f52192a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i10, i11, fontMetricsInt) / 3) * 2;
    }
}
