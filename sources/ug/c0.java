package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.lp0;
public final class c0 extends x0 {
    public final Path f55890o3;
    public final lp0 f55891p3;

    public c0(lp0 lp0Var, Context context) {
        super(context);
        this.f55891p3 = lp0Var;
        this.f55890o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        lp0 lp0Var = this.f55891p3;
        barView = lp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f55890o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
