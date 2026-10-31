package tg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import vg.k;
public final class i extends Drawable {
    public wg.a f48750a;
    public int f48751b;
    public int f48752c;
    public int f48753f;
    public vg.g f48756j;
    public boolean f48758l;
    public float f48759m;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f48754g = new Paint(1);
    public final k h = new k();
    public final float[] f48755i = new float[8];
    public int f48757k = a7.f20158b;

    public final void a() {
        this.f48757k = a7.f20158b;
        wg.a aVar = this.f48750a;
        if (aVar == null) {
            return;
        }
        this.f48751b = t6.r1(this.d, aVar.u());
        this.f48752c = t6.r1(this.d, this.f48750a.E());
        float N = i0.N(1.0f);
        this.f48756j = new vg.g(this.f48751b, N, this.f48752c, i0.N(0.6666667f), 0, 0.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f48757k != a7.f20158b) {
            try {
                a();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f48753f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f48758l) {
            rectF.set(getBounds());
            min = this.f48759m;
        }
        Paint paint = this.f48754g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f48756j != null) {
            Arrays.fill(this.f48755i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f48755i, this.f48756j, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
