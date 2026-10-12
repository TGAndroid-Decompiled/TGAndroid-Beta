package yh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.LiteMode;
import zh.b8;
public final class m1 extends Drawable {
    public final int f48988a;
    public final RectF f48989b;
    public final Path f48990c;
    public final Paint d;
    public final b8 e;
    public boolean f48991f;
    public rh.j f48992g;
    public ji.p1 h;
    public boolean f48993i;

    public m1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f48993i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f48991f == z10) {
            return;
        }
        this.f48991f = z10;
        if (z10) {
            zf.i d = zf.i.d();
            rh.j jVar = new rh.j(this, 28);
            this.f48992g = jVar;
            d.a(15, jVar);
        } else {
            zf.i.d().f(this.f48992g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f48990c;
        canvas.drawPath(path, paint);
        b8 b8Var = this.e;
        if (b8Var != null) {
            if (this.f48991f || !this.f48993i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f48992g == null) {
                    b8Var.d();
                }
                b8Var.a(canvas, this.f48988a);
                canvas.restore();
                if (this.f48992g == null) {
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
        RectF rectF = this.f48989b;
        rectF.set(rect);
        Path path = this.f48990c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        b8 b8Var = this.e;
        if (b8Var != null) {
            b8Var.g(rectF);
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
        this.f48989b = new RectF();
        this.f48990c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f48988a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new b8(1, 25);
        } else {
            this.e = null;
        }
    }
}
