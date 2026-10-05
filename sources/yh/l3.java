package yh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends Drawable {
    public final float f51575a;
    public final Paint f51576b;

    public l3(float f7, int i10) {
        Paint paint = new Paint(1);
        this.f51576b = paint;
        this.f51575a = f7;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.f51576b;
        float f7 = this.f51575a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f7);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
