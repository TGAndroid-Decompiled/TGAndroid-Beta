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
    public final int f46024a;
    public final RectF f46025b;
    public final Path f46026c;
    public final Paint d;
    public final j8 e;
    public boolean f46027f;
    public rg.w1 f46028g;
    public org.telegram.ui.web.b1 h;
    public boolean f46029i;

    public n1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f46029i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46027f == z10) {
            return;
        }
        this.f46027f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.w1 w1Var = new rg.w1(this, 16);
            this.f46028g = w1Var;
            d.a(15, w1Var);
        } else {
            yf.h.d().f(this.f46028g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f46026c;
        canvas.drawPath(path, paint);
        j8 j8Var = this.e;
        if (j8Var != null) {
            if (this.f46027f || !this.f46029i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f46028g == null) {
                    j8Var.d();
                }
                j8Var.a(canvas, this.f46024a);
                canvas.restore();
                if (this.f46028g == null) {
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
        RectF rectF = this.f46025b;
        rectF.set(rect);
        Path path = this.f46026c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        j8 j8Var = this.e;
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
        this.f46025b = new RectF();
        this.f46026c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46024a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new j8(1, 25);
        } else {
            this.e = null;
        }
    }
}
