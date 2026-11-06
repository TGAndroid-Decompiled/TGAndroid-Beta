package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.tp0;
public final class d0 extends y0 {
    public final Path f55504n3;
    public final tp0 f55505o3;

    public d0(tp0 tp0Var, Context context) {
        super(context);
        this.f55505o3 = tp0Var;
        this.f55504n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        tp0 tp0Var = this.f55505o3;
        barView = tp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(tp0Var.f55582w1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(tp0Var.f55582w1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(tp0Var.f55582w1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(tp0Var.f55582w1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f55504n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
