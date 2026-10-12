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
import yh.b8;
public final class n1 extends Drawable {
    public final int f51615a;
    public final RectF f51616b;
    public final Path f51617c;
    public final Paint d;
    public final b8 f51618e;
    public boolean f51619f;
    public rg.x1 f51620g;
    public ii.q1 h;
    public boolean f51621i;

    public n1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f51618e != null && this.f51621i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51619f == z10) {
            return;
        }
        this.f51619f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            rg.x1 x1Var = new rg.x1(this, 21);
            this.f51620g = x1Var;
            d.a(15, x1Var);
        } else {
            yf.h.d().f(this.f51620g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f51617c;
        canvas.drawPath(path, paint);
        b8 b8Var = this.f51618e;
        if (b8Var != null) {
            if (this.f51619f || !this.f51621i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f51620g == null) {
                    b8Var.d();
                }
                b8Var.a(canvas, this.f51615a);
                canvas.restore();
                if (this.f51620g == null) {
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
        RectF rectF = this.f51616b;
        rectF.set(rect);
        Path path = this.f51617c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        b8 b8Var = this.f51618e;
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

    public n1(int i10, int i11) {
        this.f51616b = new RectF();
        this.f51617c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f51615a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f51618e = new b8(1, 25);
        } else {
            this.f51618e = null;
        }
    }
}
