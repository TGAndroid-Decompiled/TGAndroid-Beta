package yh;

import ai.ce;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
public final class m1 extends Drawable {
    public final int f50388a;
    public final RectF f50389b;
    public final Path f50390c;
    public final Paint d;
    public final ce e;
    public boolean f50391f;
    public tg.p f50392g;
    public ig.l0 h;
    public boolean f50393i;

    public m1(int i10) {
        this(i0.b.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f50393i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50391f == z10) {
            return;
        }
        this.f50391f = z10;
        if (z10) {
            zf.h d = zf.h.d();
            tg.p pVar = new tg.p(this, 18);
            this.f50392g = pVar;
            d.a(15, pVar);
        } else {
            zf.h.d().f(this.f50392g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f50390c;
        canvas.drawPath(path, paint);
        ce ceVar = this.e;
        if (ceVar != null) {
            if (this.f50391f || !this.f50393i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f50392g == null) {
                    ceVar.d();
                }
                ceVar.a(canvas, this.f50388a);
                canvas.restore();
                if (this.f50392g == null) {
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
        RectF rectF = this.f50389b;
        rectF.set(rect);
        Path path = this.f50390c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ce ceVar = this.e;
        if (ceVar != null) {
            ceVar.g(rectF);
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
        this.f50389b = new RectF();
        this.f50390c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f50388a = i10;
        paint.setColor(i11);
        if (g0.a.g()) {
            this.e = new ce(1, 25);
        } else {
            this.e = null;
        }
    }
}
