package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class p6 extends ReplacementSpan {
    public final Paint f50988a;
    public final i11 f50989b;
    public final int f50990c;

    public p6(int i10, String str) {
        this.f50990c = i10;
        Paint paint = new Paint(1);
        this.f50988a = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.m1(0.1f, i10));
        this.f50989b = new i11(str, 13.0f, AndroidUtilities.bold());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        int i15 = i12 + i14;
        rectF.set(f7, (i15 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f7 + this.f50989b.f25455c, (AndroidUtilities.dp(20.0f) + i15) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f50988a);
        int i16 = this.f50990c;
        this.f50989b.c(f7 + AndroidUtilities.dp(6.0f), i15 / 2.0f, 1.0f, i16, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.f50989b.f25455c);
    }
}
