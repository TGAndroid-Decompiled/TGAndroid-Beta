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
    public final int f60276a;
    public final RectF f60277b;
    public final Path f60278c;
    public final Paint d;
    public final ud f60279e;
    public boolean f60280f;
    public wg.p f60281g;
    public xg.a h;
    public boolean f60282i;

    public d1(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z9;
        if (this.f60279e != null && this.f60282i && sc.e(131072)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f60280f == z9) {
            return;
        }
        this.f60280f = z9;
        if (z9) {
            bg.k d = bg.k.d();
            wg.p pVar = new wg.p(this, 10);
            this.f60281g = pVar;
            d.a(15, pVar);
        } else {
            bg.k.d().f(this.f60281g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f60278c;
        canvas.drawPath(path, paint);
        ud udVar = this.f60279e;
        if (udVar != null) {
            if (this.f60280f || !this.f60282i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f60281g == null) {
                    udVar.d();
                }
                udVar.a(canvas, this.f60276a);
                canvas.restore();
                if (this.f60281g == null) {
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
        RectF rectF = this.f60277b;
        rectF.set(rect);
        Path path = this.f60278c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ud udVar = this.f60279e;
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
        this.f60277b = new RectF();
        this.f60278c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f60276a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60279e = new ud(1, 25);
        } else {
            this.f60279e = null;
        }
    }
}
