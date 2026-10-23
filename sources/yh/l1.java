package yh;

import ai.de;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.LiteMode;
public final class l1 extends Drawable {
    public final int f50363a;
    public final RectF f50364b;
    public final Path f50365c;
    public final Paint d;
    public final de e;
    public boolean f50366f;
    public tg.p f50367g;
    public ig.l0 h;
    public boolean f50368i;

    public l1(int i10) {
        this(i0.a.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f50368i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50366f == z10) {
            return;
        }
        this.f50366f = z10;
        if (z10) {
            zf.h d = zf.h.d();
            tg.p pVar = new tg.p(this, 18);
            this.f50367g = pVar;
            d.a(15, pVar);
        } else {
            zf.h.d().f(this.f50367g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50365c;
        canvas.drawPath(path, paint);
        de deVar = this.e;
        if (deVar != null) {
            if (this.f50366f || !this.f50368i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50367g == null) {
                    deVar.d();
                }
                deVar.a(canvas, this.f50363a);
                canvas.restore();
                if (this.f50367g == null) {
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
        RectF rectF = this.f50364b;
        rectF.set(rect);
        Path path = this.f50365c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        de deVar = this.e;
        if (deVar != null) {
            deVar.g(rectF);
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

    public l1(int i10, int i11) {
        this.f50364b = new RectF();
        this.f50365c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50363a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new de(1, 25);
        } else {
            this.e = null;
        }
    }
}
