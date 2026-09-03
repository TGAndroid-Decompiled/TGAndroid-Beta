package sh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z5;
import qh.u9;
public final class d0 extends Drawable {
    public final Paint f47416a = new Paint(1);
    public final RectF f47417b = new RectF();
    public final int f47418c;
    public final Path d;
    public boolean f47419e;
    public int f47420f;
    public final z5 f47421g;
    public final z5 h;

    public d0(int i10) {
        Path path = new Path();
        this.d = path;
        u9 u9Var = new u9(this, 6);
        pr prVar = pr.h;
        this.f47421g = new z5(u9Var, 320L, prVar, 0);
        this.h = new z5(new u9(this, 6), 320L, prVar, 0);
        this.f47418c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f47417b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f47418c;
        Paint paint = this.f47416a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e6 = this.f47421g.e(this.f47419e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f47420f, false);
        if (e6 > 0.0f) {
            canvas.save();
            canvas.translate(dp, e2.c.w(1.0f, e6, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
