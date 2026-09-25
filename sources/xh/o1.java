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
import yh.i8;
public final class o1 extends Drawable {
    public final int f46322a;
    public final RectF f46323b;
    public final Path f46324c;
    public final Paint d;
    public final i8 e;
    public boolean f46325f;
    public rg.q1 f46326g;
    public ii.q1 h;
    public boolean f46327i;

    public o1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f46327i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46325f == z10) {
            return;
        }
        this.f46325f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.q1 q1Var = new rg.q1(this, 17);
            this.f46326g = q1Var;
            d.a(15, q1Var);
        } else {
            yf.h.d().f(this.f46326g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f46324c;
        canvas.drawPath(path, paint);
        i8 i8Var = this.e;
        if (i8Var != null) {
            if (this.f46325f || !this.f46327i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f46326g == null) {
                    i8Var.d();
                }
                i8Var.a(canvas, this.f46322a);
                canvas.restore();
                if (this.f46326g == null) {
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
        RectF rectF = this.f46323b;
        rectF.set(rect);
        Path path = this.f46324c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        i8 i8Var = this.e;
        if (i8Var != null) {
            i8Var.g(rectF);
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

    public o1(int i10, int i11) {
        this.f46323b = new RectF();
        this.f46324c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46322a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new i8(1, 25);
        } else {
            this.e = null;
        }
    }
}
