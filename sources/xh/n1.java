package xh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.LiteMode;
import yh.j8;
public final class n1 extends Drawable {
    public final int f50133a;
    public final RectF f50134b;
    public final Path f50135c;
    public final Paint d;
    public final j8 f50136e;
    public boolean f50137f;
    public rg.s1 f50138g;
    public ii.q1 h;
    public boolean f50139i;

    public n1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f50136e != null && this.f50139i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50137f == z10) {
            return;
        }
        this.f50137f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.s1 s1Var = new rg.s1(this, 17);
            this.f50138g = s1Var;
            d.a(15, s1Var);
        } else {
            yf.h.d().f(this.f50138g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50135c;
        canvas.drawPath(path, paint);
        j8 j8Var = this.f50136e;
        if (j8Var != null) {
            if (this.f50137f || !this.f50139i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50138g == null) {
                    j8Var.d();
                }
                j8Var.a(canvas, this.f50133a);
                canvas.restore();
                if (this.f50138g == null) {
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
        RectF rectF = this.f50134b;
        rectF.set(rect);
        Path path = this.f50135c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        j8 j8Var = this.f50136e;
        if (j8Var != null) {
            j8Var.g(rectF);
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

    public n1(int i10, int i11) {
        this.f50134b = new RectF();
        this.f50135c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50133a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50136e = new j8(1, 25);
        } else {
            this.f50136e = null;
        }
    }
}
