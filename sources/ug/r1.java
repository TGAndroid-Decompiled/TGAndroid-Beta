package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.j4;
public final class r1 extends j4 {
    public final Path h;
    public final t1 f56720n;

    public r1(t1 t1Var, Context context) {
        super(context);
        this.f56720n = t1Var;
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
        t1 t1Var = this.f56720n;
        if (t1Var.d) {
            org.telegram.messenger.g0.P.set(0.0f, -t1Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + t1Var.M));
        }
        float L = t1Var.M - org.telegram.messenger.g0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.g0.P, L, L, Path.Direction.CW);
    }
}
