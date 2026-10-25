package zh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bi.td;
import org.telegram.messenger.LiteMode;
public final class m1 extends Drawable {
    public final int f53134a;
    public final RectF f53135b;
    public final Path f53136c;
    public final Paint d;
    public final td e;
    public boolean f53137f;
    public ti.g f53138g;
    public l1 h;
    public boolean f53139i;

    public m1(int i10) {
        this(i0.a.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f53139i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f53137f == z10) {
            return;
        }
        this.f53137f = z10;
        if (z10) {
            ag.n d = ag.n.d();
            ti.g gVar = new ti.g(this, 22);
            this.f53138g = gVar;
            d.a(15, gVar);
        } else {
            ag.n.d().g(this.f53138g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f53136c;
        canvas.drawPath(path, paint);
        td tdVar = this.e;
        if (tdVar != null) {
            if (this.f53137f || !this.f53139i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f53138g == null) {
                    tdVar.d();
                }
                tdVar.a(canvas, this.f53134a);
                canvas.restore();
                if (this.f53138g == null) {
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
        RectF rectF = this.f53135b;
        rectF.set(rect);
        Path path = this.f53136c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        td tdVar = this.e;
        if (tdVar != null) {
            tdVar.g(rectF);
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
        this.f53135b = new RectF();
        this.f53136c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f53134a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new td(1, 25);
        } else {
            this.e = null;
        }
    }
}
