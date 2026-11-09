package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.wp0;
public final class d0 extends y0 {
    public final Path f55633n3;
    public final wp0 f55634o3;

    public d0(wp0 wp0Var, Context context) {
        super(context);
        this.f55634o3 = wp0Var;
        this.f55633n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        wp0 wp0Var = this.f55634o3;
        barView = wp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(wp0Var.f55711w1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(wp0Var.f55711w1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(wp0Var.f55711w1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(wp0Var.f55711w1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f55633n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
