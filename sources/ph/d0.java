package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
public final class d0 extends Drawable {
    public final Paint f45757a = new Paint(1);
    public final RectF f45758b = new RectF();
    public final int f45759c;
    public final Path d;
    public boolean f45760e;
    public int f45761f;
    public final d6 f45762g;
    public final d6 h;

    public d0(int i10) {
        Path path = new Path();
        this.d = path;
        org.telegram.ui.web.t1 t1Var = new org.telegram.ui.web.t1(this, 2);
        jr jrVar = jr.h;
        this.f45762g = new d6(t1Var, 320L, jrVar, 0);
        this.h = new d6(new org.telegram.ui.web.t1(this, 2), 320L, jrVar, 0);
        this.f45759c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f45758b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f45759c;
        Paint paint = this.f45757a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e10 = this.f45762g.e(this.f45760e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f45761f, false);
        if (e10 > 0.0f) {
            canvas.save();
            canvas.translate(dp, com.google.android.recaptcha.internal.a.z(1.0f, e10, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
