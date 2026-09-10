package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.t01;
public final class c0 extends ReplacementSpan {
    public final RectF f48315a = new RectF();
    public final Paint f48316b = new Paint(1);
    public final t01 f48317c = new t01(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(0.0f);
        RectF rectF = this.f48315a;
        rectF.set(f7, dp - AndroidUtilities.dp(6.0f), this.f48317c.l() + f7 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + dp);
        Paint paint2 = this.f48316b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f48317c.c(AndroidUtilities.dp(4.0f) + f7, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f48317c.l() + AndroidUtilities.dp(8.0f));
    }
}
