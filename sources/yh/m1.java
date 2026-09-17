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
import zh.h8;
public final class m1 extends Drawable {
    public final int f50462a;
    public final RectF f50463b;
    public final Path f50464c;
    public final Paint d;
    public final h8 f50465e;
    public boolean f50466f;
    public sg.p0 f50467g;
    public org.telegram.ui.web.b1 h;
    public boolean f50468i;

    public m1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f50465e != null && this.f50468i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50466f == z10) {
            return;
        }
        this.f50466f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            sg.p0 p0Var = new sg.p0(this, 21);
            this.f50467g = p0Var;
            d.a(15, p0Var);
        } else {
            yf.h.d().f(this.f50467g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50464c;
        canvas.drawPath(path, paint);
        h8 h8Var = this.f50465e;
        if (h8Var != null) {
            if (this.f50466f || !this.f50468i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50467g == null) {
                    h8Var.d();
                }
                h8Var.a(canvas, this.f50462a);
                canvas.restore();
                if (this.f50467g == null) {
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
        RectF rectF = this.f50463b;
        rectF.set(rect);
        Path path = this.f50464c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        h8 h8Var = this.f50465e;
        if (h8Var != null) {
            h8Var.g(rectF);
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
        this.f50463b = new RectF();
        this.f50464c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50462a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50465e = new h8(1, 25);
        } else {
            this.f50465e = null;
        }
    }
}
