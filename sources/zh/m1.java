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
    public final int f53195a;
    public final RectF f53196b;
    public final Path f53197c;
    public final Paint d;
    public final td e;
    public boolean f53198f;
    public ti.g f53199g;
    public l1 h;
    public boolean f53200i;

    public m1(int i10) {
        this(i0.a.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.e != null && this.f53200i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f53198f == z10) {
            return;
        }
        this.f53198f = z10;
        if (z10) {
            ag.n d = ag.n.d();
            ti.g gVar = new ti.g(this, 22);
            this.f53199g = gVar;
            d.a(15, gVar);
        } else {
            ag.n.d().g(this.f53199g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f53197c;
        canvas.drawPath(path, paint);
        td tdVar = this.e;
        if (tdVar != null) {
            if (this.f53198f || !this.f53200i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f53199g == null) {
                    tdVar.d();
                }
                tdVar.a(canvas, this.f53195a);
                canvas.restore();
                if (this.f53199g == null) {
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
        RectF rectF = this.f53196b;
        rectF.set(rect);
        Path path = this.f53197c;
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
        this.f53196b = new RectF();
        this.f53197c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f53195a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new td(1, 25);
        } else {
            this.e = null;
        }
    }
}
