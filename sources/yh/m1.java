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
    public final int f50461a;
    public final RectF f50462b;
    public final Path f50463c;
    public final Paint d;
    public final h8 f50464e;
    public boolean f50465f;
    public sg.p0 f50466g;
    public org.telegram.ui.web.b1 h;
    public boolean f50467i;

    public m1(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f50464e != null && this.f50467i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50465f == z10) {
            return;
        }
        this.f50465f = z10;
        if (z10) {
            yf.h d = yf.h.d();
            sg.p0 p0Var = new sg.p0(this, 21);
            this.f50466g = p0Var;
            d.a(15, p0Var);
        } else {
            yf.h.d().f(this.f50466g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50463c;
        canvas.drawPath(path, paint);
        h8 h8Var = this.f50464e;
        if (h8Var != null) {
            if (this.f50465f || !this.f50467i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50466g == null) {
                    h8Var.d();
                }
                h8Var.a(canvas, this.f50461a);
                canvas.restore();
                if (this.f50466g == null) {
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
        RectF rectF = this.f50462b;
        rectF.set(rect);
        Path path = this.f50463c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        h8 h8Var = this.f50464e;
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
        this.f50462b = new RectF();
        this.f50463c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50461a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50464e = new h8(1, 25);
        } else {
            this.f50464e = null;
        }
    }
}
