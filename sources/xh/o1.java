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
    public final int f46294a;
    public final RectF f46295b;
    public final Path f46296c;
    public final Paint d;
    public final i8 e;
    public boolean f46297f;
    public rg.w1 f46298g;
    public org.telegram.ui.web.b1 h;
    public boolean f46299i;

    public o1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f46299i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46297f == z10) {
            return;
        }
        this.f46297f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.w1 w1Var = new rg.w1(this, 16);
            this.f46298g = w1Var;
            d.a(15, w1Var);
        } else {
            yf.h.d().f(this.f46298g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f46296c;
        canvas.drawPath(path, paint);
        i8 i8Var = this.e;
        if (i8Var != null) {
            if (this.f46297f || !this.f46299i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f46298g == null) {
                    i8Var.d();
                }
                i8Var.a(canvas, this.f46294a);
                canvas.restore();
                if (this.f46298g == null) {
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
        RectF rectF = this.f46295b;
        rectF.set(rect);
        Path path = this.f46296c;
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
        this.f46295b = new RectF();
        this.f46296c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46294a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new i8(1, 25);
        } else {
            this.e = null;
        }
    }
}
