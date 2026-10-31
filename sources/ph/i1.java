package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.w5;
import rh.s8;
public final class i1 extends Drawable {
    public final int f45113a;
    public final RectF f45114b;
    public final Path f45115c;
    public final Paint d;
    public final s8 e;
    public boolean f45116f;
    public w5 f45117g;
    public h1 h;
    public boolean f45118i;

    public i1(int i10) {
        this(i0.b.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f45118i && sc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45116f == z10) {
            return;
        }
        this.f45116f = z10;
        if (z10) {
            rf.g d = rf.g.d();
            w5 w5Var = new w5(this, 29);
            this.f45117g = w5Var;
            d.a(15, w5Var);
        } else {
            rf.g.d().f(this.f45117g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f45115c;
        canvas.drawPath(path, paint);
        s8 s8Var = this.e;
        if (s8Var != null) {
            if (this.f45116f || !this.f45118i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f45117g == null) {
                    s8Var.d();
                }
                s8Var.a(canvas, this.f45113a);
                canvas.restore();
                if (this.f45117g == null) {
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
        RectF rectF = this.f45114b;
        rectF.set(rect);
        Path path = this.f45115c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.g(rectF);
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

    public i1(int i10, int i11) {
        this.f45114b = new RectF();
        this.f45115c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f45113a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new s8(1, 25);
        } else {
            this.e = null;
        }
    }
}
