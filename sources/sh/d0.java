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
import qh.v9;
public final class d0 extends Drawable {
    public final Paint f47380a = new Paint(1);
    public final RectF f47381b = new RectF();
    public final int f47382c;
    public final Path d;
    public boolean f47383e;
    public int f47384f;
    public final z5 f47385g;
    public final z5 h;

    public d0(int i10) {
        Path path = new Path();
        this.d = path;
        v9 v9Var = new v9(this, 6);
        pr prVar = pr.h;
        this.f47385g = new z5(v9Var, 320L, prVar, 0);
        this.h = new z5(new v9(this, 6), 320L, prVar, 0);
        this.f47382c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f47381b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f47382c;
        Paint paint = this.f47380a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e6 = this.f47385g.e(this.f47383e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f47384f, false);
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
