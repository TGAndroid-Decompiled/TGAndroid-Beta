package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z5;
import ph.ga;
public final class e0 extends Drawable {
    public final Paint f43496a = new Paint(1);
    public final RectF f43497b = new RectF();
    public final int f43498c;
    public final Path d;
    public boolean e;
    public int f43499f;
    public final z5 f43500g;
    public final z5 h;

    public e0(int i10) {
        Path path = new Path();
        this.d = path;
        ga gaVar = new ga(this, 4);
        nr nrVar = nr.h;
        this.f43500g = new z5(gaVar, 320L, nrVar, 0);
        this.h = new z5(new ga(this, 4), 320L, nrVar, 0);
        this.f43498c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f43497b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f43498c;
        Paint paint = this.f43496a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f43500g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f43499f, false);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(dp, e2.c.w(1.0f, e, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
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
