package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class o3 extends Drawable {
    public final float f47278a;
    public final Paint f47279b;

    public o3(float f7, int i10) {
        Paint paint = new Paint(1);
        this.f47279b = paint;
        this.f47278a = f7;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getBounds());
        Paint paint = this.f47279b;
        float f7 = this.f47278a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        org.telegram.messenger.i0.P(canvas, rectF, f7);
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
