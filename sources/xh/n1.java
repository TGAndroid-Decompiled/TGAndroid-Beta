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
import yh.l8;
public final class n1 extends Drawable {
    public final int f50140a;
    public final RectF f50141b;
    public final Path f50142c;
    public final Paint d;
    public final l8 f50143e;
    public boolean f50144f;
    public rg.s1 f50145g;
    public ii.q1 h;
    public boolean f50146i;

    public n1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f50143e != null && this.f50146i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50144f == z10) {
            return;
        }
        this.f50144f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.s1 s1Var = new rg.s1(this, 17);
            this.f50145g = s1Var;
            d.a(15, s1Var);
        } else {
            yf.h.d().f(this.f50145g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50142c;
        canvas.drawPath(path, paint);
        l8 l8Var = this.f50143e;
        if (l8Var != null) {
            if (this.f50144f || !this.f50146i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50145g == null) {
                    l8Var.d();
                }
                l8Var.a(canvas, this.f50140a);
                canvas.restore();
                if (this.f50145g == null) {
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
        RectF rectF = this.f50141b;
        rectF.set(rect);
        Path path = this.f50142c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        l8 l8Var = this.f50143e;
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

    public n1(int i10, int i11) {
        this.f50141b = new RectF();
        this.f50142c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50140a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50143e = new l8(1, 25);
        } else {
            this.f50143e = null;
        }
    }
}
