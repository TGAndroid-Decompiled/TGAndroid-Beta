package wh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.LiteMode;
import xh.l8;
public final class m1 extends Drawable {
    public final int f44240a;
    public final RectF f44241b;
    public final Path f44242c;
    public final Paint d;
    public final l8 e;
    public boolean f44243f;
    public qg.q0 f44244g;
    public org.telegram.ui.web.y1 h;
    public boolean f44245i;

    public m1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f44245i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f44243f == z10) {
            return;
        }
        this.f44243f = z10;
        if (z10) {
            xf.h d = xf.h.d();
            qg.q0 q0Var = new qg.q0(this, 23);
            this.f44244g = q0Var;
            d.a(15, q0Var);
        } else {
            xf.h.d().f(this.f44244g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f44242c;
        canvas.drawPath(path, paint);
        l8 l8Var = this.e;
        if (l8Var != null) {
            if (this.f44243f || !this.f44245i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f44244g == null) {
                    l8Var.d();
                }
                l8Var.a(canvas, this.f44240a);
                canvas.restore();
                if (this.f44244g == null) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.f44241b;
        rectF.set(rect);
        Path path = this.f44242c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        l8 l8Var = this.e;
        if (l8Var != null) {
            l8Var.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public m1(int i10, int i11) {
        this.f44241b = new RectF();
        this.f44242c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f44240a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new l8(1, 25);
        } else {
            this.e = null;
        }
    }
}
