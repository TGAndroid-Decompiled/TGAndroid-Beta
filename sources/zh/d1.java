package zh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bi.ud;
import org.telegram.messenger.sc;
public final class d1 extends Drawable {
    public final int f60287a;
    public final RectF f60288b;
    public final Path f60289c;
    public final Paint d;
    public final ud f60290e;
    public boolean f60291f;
    public wg.a0 f60292g;
    public xg.a h;
    public boolean f60293i;

    public d1(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z9;
        if (this.f60290e != null && this.f60293i && sc.e(131072)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f60291f == z9) {
            return;
        }
        this.f60291f = z9;
        if (z9) {
            bg.k d = bg.k.d();
            wg.a0 a0Var = new wg.a0(this, 8);
            this.f60292g = a0Var;
            d.a(15, a0Var);
        } else {
            bg.k.d().f(this.f60292g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f60289c;
        canvas.drawPath(path, paint);
        ud udVar = this.f60290e;
        if (udVar != null) {
            if (this.f60291f || !this.f60293i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f60292g == null) {
                    udVar.d();
                }
                udVar.a(canvas, this.f60287a);
                canvas.restore();
                if (this.f60292g == null) {
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
        RectF rectF = this.f60288b;
        rectF.set(rect);
        Path path = this.f60289c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ud udVar = this.f60290e;
        if (udVar != null) {
            udVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.d.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public d1(int i7, int i10) {
        this.f60288b = new RectF();
        this.f60289c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f60287a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60290e = new ud(1, 25);
        } else {
            this.f60290e = null;
        }
    }
}
