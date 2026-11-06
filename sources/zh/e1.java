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
import org.telegram.messenger.rc;
public final class e1 extends Drawable {
    public final int f60198a;
    public final RectF f60199b;
    public final Path f60200c;
    public final Paint d;
    public final ud f60201e;
    public boolean f60202f;
    public wg.p f60203g;
    public xg.a h;
    public boolean f60204i;

    public e1(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z9;
        if (this.f60201e != null && this.f60204i && rc.e(131072)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f60202f == z9) {
            return;
        }
        this.f60202f = z9;
        if (z9) {
            bg.k d = bg.k.d();
            wg.p pVar = new wg.p(this, 10);
            this.f60203g = pVar;
            d.a(15, pVar);
        } else {
            bg.k.d().f(this.f60203g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f60200c;
        canvas.drawPath(path, paint);
        ud udVar = this.f60201e;
        if (udVar != null) {
            if (this.f60202f || !this.f60204i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f60203g == null) {
                    udVar.d();
                }
                udVar.a(canvas, this.f60198a);
                canvas.restore();
                if (this.f60203g == null) {
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
        RectF rectF = this.f60199b;
        rectF.set(rect);
        Path path = this.f60200c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ud udVar = this.f60201e;
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

    public e1(int i7, int i10) {
        this.f60199b = new RectF();
        this.f60200c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f60198a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60201e = new ud(1, 25);
        } else {
            this.f60201e = null;
        }
    }
}
