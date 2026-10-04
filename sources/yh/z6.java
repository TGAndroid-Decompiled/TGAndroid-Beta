package yh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class z6 extends ReplacementSpan {
    public final Paint f52343a;
    public final e11 f52344b;
    public final int f52345c;

    public z6(int i10, String str) {
        this.f52345c = i10;
        Paint paint = new Paint(1);
        this.f52343a = paint;
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
        this.f52344b = new e11(str, 13.0f, AndroidUtilities.bold());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        int i15 = i12 + i14;
        rectF.set(f7, (i15 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f7 + this.f52344b.f25884c, (AndroidUtilities.dp(20.0f) + i15) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f52343a);
        int i16 = this.f52345c;
        this.f52344b.c(f7 + AndroidUtilities.dp(6.0f), i15 / 2.0f, 1.0f, i16, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.f52344b.f25884c);
    }
}
