package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import rh.s8;
public final class d0 extends LinearLayout {
    public s8 f48875a;
    public final Path f48876b;
    public final Paint f48877c;
    public long d;
    public final org.telegram.ui.Components.t5 e;
    public final g0 f48878f;

    public d0(g0 g0Var, Context context) {
        super(context);
        this.f48878f = g0Var;
        this.f48876b = new Path();
        this.f48877c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.t5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f48876b;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        g0 g0Var = this.f48878f;
        i0 i0Var = g0Var.f48999f;
        if (i0Var != null) {
            int b10 = o.b(i0Var.f49065a, i0Var.b(), 3);
            i0 i0Var2 = g0Var.f48999f;
            int b11 = o.b(i0Var2.f49065a, i0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            i0 i0Var3 = g0Var.f48999f;
            int i10 = (j10 > i0Var3.f49066b ? 1 : (j10 == i0Var3.f49066b ? 0 : -1));
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (i10 != 0) {
                t5Var.e(true, i0Var3.a());
            }
            float e = t5Var.e(false, g0Var.f48999f.a());
            this.d = g0Var.f48999f.f49066b;
            Paint paint = this.f48877c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f48875a == null) {
            this.f48875a = new s8(1, 250);
        }
        this.f48875a.f(0, 0, getWidth(), getHeight());
        s8 s8Var = this.f48875a;
        s8Var.h = 30.0f;
        s8Var.d();
        this.f48875a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
