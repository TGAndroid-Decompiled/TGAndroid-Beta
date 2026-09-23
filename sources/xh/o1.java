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
    public final int f45993a;
    public final RectF f45994b;
    public final Path f45995c;
    public final Paint d;
    public final i8 e;
    public boolean f45996f;
    public rg.w1 f45997g;
    public ii.q1 h;
    public boolean f45998i;

    public o1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f45998i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45996f == z10) {
            return;
        }
        this.f45996f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.w1 w1Var = new rg.w1(this, 16);
            this.f45997g = w1Var;
            d.a(15, w1Var);
        } else {
            yf.h.d().f(this.f45997g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f45995c;
        canvas.drawPath(path, paint);
        i8 i8Var = this.e;
        if (i8Var != null) {
            if (this.f45996f || !this.f45998i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f45997g == null) {
                    i8Var.d();
                }
                i8Var.a(canvas, this.f45993a);
                canvas.restore();
                if (this.f45997g == null) {
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
        RectF rectF = this.f45994b;
        rectF.set(rect);
        Path path = this.f45995c;
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
        this.f45994b = new RectF();
        this.f45995c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f45993a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new i8(1, 25);
        } else {
            this.e = null;
        }
    }
}
