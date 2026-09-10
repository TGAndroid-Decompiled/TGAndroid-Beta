package zg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class i extends Drawable {
    public ch.a f48134a;
    public int f48135b;
    public int f48136c;
    public int f48137f;
    public boolean f48140j;
    public float f48141k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f48138g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f48139i = new Paint(1);

    public final void a(ch.a aVar) {
        this.f48134a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f48139i.setStyle(style);
        b();
    }

    public final void b() {
        ch.a aVar = this.f48134a;
        if (aVar == null) {
            return;
        }
        this.f48135b = j6.l1(this.d, aVar.h());
        this.f48136c = j6.l1(this.d, this.f48134a.p());
        int i10 = this.f48135b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f48136c;
        Paint paint2 = this.f48139i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f48137f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f48140j) {
            rectF.set(getBounds());
            min = this.f48141k;
        }
        float f7 = min;
        Paint paint = this.f48138g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f48135b != 0) {
            canvas2 = canvas;
            bh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f48136c != 0) {
            bh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f48139i);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        b();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
