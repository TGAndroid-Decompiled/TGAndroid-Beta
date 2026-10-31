package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.qz0;
public final class m7 extends ReplacementSpan {
    public final Paint f47207a;
    public final qz0 f47208b;
    public final int f47209c;

    public m7(int i10, String str) {
        this.f47209c = i10;
        Paint paint = new Paint(1);
        this.f47207a = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i10));
        this.f47208b = new qz0(str, 13.0f, org.telegram.messenger.i0.o());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        RectF rectF = org.telegram.messenger.i0.P;
        int i15 = i12 + i14;
        rectF.set(f7, (i15 - org.telegram.messenger.i0.L(20.0f)) / 2.0f, org.telegram.messenger.i0.L(12.0f) + f7 + this.f47208b.f29774c, (org.telegram.messenger.i0.L(20.0f) + i15) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.f47207a);
        int i16 = this.f47209c;
        this.f47208b.c(f7 + org.telegram.messenger.i0.L(6.0f), i15 / 2.0f, 1.0f, i16, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.i0.L(12.0f) + this.f47208b.f29774c);
    }
}
