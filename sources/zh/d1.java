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
    public final int f60285a;
    public final RectF f60286b;
    public final Path f60287c;
    public final Paint d;
    public final ud f60288e;
    public boolean f60289f;
    public wg.a0 f60290g;
    public xg.a h;
    public boolean f60291i;

    public d1(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z9;
        if (this.f60288e != null && this.f60291i && sc.e(131072)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f60289f == z9) {
            return;
        }
        this.f60289f = z9;
        if (z9) {
            bg.k d = bg.k.d();
            wg.a0 a0Var = new wg.a0(this, 8);
            this.f60290g = a0Var;
            d.a(15, a0Var);
        } else {
            bg.k.d().f(this.f60290g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f60287c;
        canvas.drawPath(path, paint);
        ud udVar = this.f60288e;
        if (udVar != null) {
            if (this.f60289f || !this.f60291i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f60290g == null) {
                    udVar.d();
                }
                udVar.a(canvas, this.f60285a);
                canvas.restore();
                if (this.f60290g == null) {
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
        RectF rectF = this.f60286b;
        rectF.set(rect);
        Path path = this.f60287c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ud udVar = this.f60288e;
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
        this.f60286b = new RectF();
        this.f60287c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f60285a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60288e = new ud(1, 25);
        } else {
            this.f60288e = null;
        }
    }
}
