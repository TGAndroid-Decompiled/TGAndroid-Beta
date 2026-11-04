package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.l4;
public final class u1 extends l4 {
    public final Path h;
    public final w1 f56871n;

    public u1(w1 w1Var, Context context) {
        super(context);
        this.f56871n = w1Var;
        this.h = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Path path = this.h;
        path.reset();
        w1 w1Var = this.f56871n;
        if (w1Var.d) {
            org.telegram.messenger.g0.P.set(0.0f, -w1Var.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + w1Var.N));
        }
        float L = w1Var.N - org.telegram.messenger.g0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.g0.P, L, L, Path.Direction.CW);
    }
}
