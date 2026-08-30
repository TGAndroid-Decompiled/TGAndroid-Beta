package ph;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class m9 extends ImageSpan {
    public final Drawable f41975a;

    public m9(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.f41975a = drawable2;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f) + ((i14 - i12) / 2));
        this.f41975a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i10, i11, fontMetricsInt) / 3) * 2;
    }
}
