package xh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
public final class a0 extends Drawable {
    public final Paint f53697a = new Paint(1);
    public final RectF f53698b = new RectF();
    public final int f53699c;
    public final Path d;
    public boolean e;
    public int f53700f;
    public final t5 f53701g;
    public final t5 h;

    public a0(int i10) {
        Path path = new Path();
        this.d = path;
        vh.d0 d0Var = new vh.d0(this, 28);
        gr grVar = gr.h;
        this.f53701g = new t5(d0Var, 320L, grVar, 0);
        this.h = new t5(new vh.d0(this, 28), 320L, grVar, 0);
        this.f53699c = i10;
        path.moveTo(-org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.i0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f53698b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        int i10 = this.f53699c;
        Paint paint = this.f53697a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float d = this.f53701g.d(this.e);
        float L = (rectF.right + org.telegram.messenger.i0.L(8.0f)) - this.h.e(false, this.f53700f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, c3.i0.z(1.0f, d, org.telegram.messenger.i0.L(6.16f), org.telegram.messenger.i0.L(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
