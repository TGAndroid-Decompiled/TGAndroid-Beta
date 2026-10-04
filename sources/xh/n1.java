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
    public final int f50125a;
    public final RectF f50126b;
    public final Path f50127c;
    public final Paint d;
    public final j8 f50128e;
    public boolean f50129f;
    public rg.s1 f50130g;
    public ii.q1 h;
    public boolean f50131i;

    public n1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f50128e != null && this.f50131i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50129f == z10) {
            return;
        }
        this.f50129f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.s1 s1Var = new rg.s1(this, 17);
            this.f50130g = s1Var;
            d.a(15, s1Var);
        } else {
            yf.h.d().f(this.f50130g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50127c;
        canvas.drawPath(path, paint);
        j8 j8Var = this.f50128e;
        if (j8Var != null) {
            if (this.f50129f || !this.f50131i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50130g == null) {
                    j8Var.d();
                }
                j8Var.a(canvas, this.f50125a);
                canvas.restore();
                if (this.f50130g == null) {
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
        RectF rectF = this.f50126b;
        rectF.set(rect);
        Path path = this.f50127c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        j8 j8Var = this.f50128e;
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
        this.f50126b = new RectF();
        this.f50127c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50125a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50128e = new j8(1, 25);
        } else {
            this.f50128e = null;
        }
    }
}
