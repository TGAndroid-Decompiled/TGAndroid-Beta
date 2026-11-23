package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.j4;
public final class v1 extends j4 {
    public final Path h;
    public final x1 f59051n;

    public v1(x1 x1Var, Context context) {
        super(context);
        this.f59051n = x1Var;
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Path path = this.h;
        path.reset();
        x1 x1Var = this.f59051n;
        if (x1Var.d) {
            org.telegram.messenger.g0.P.set(0.0f, -x1Var.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + x1Var.N));
        }
        float L = x1Var.N - org.telegram.messenger.g0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.g0.P, L, L, Path.Direction.CW);
    }
}
