package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.xp0;
public final class d0 extends y0 {
    public final Path f55632n3;
    public final xp0 f55633o3;

    public d0(xp0 xp0Var, Context context) {
        super(context);
        this.f55633o3 = xp0Var;
        this.f55632n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        xp0 xp0Var = this.f55633o3;
        barView = xp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(xp0Var.f55710w1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(xp0Var.f55710w1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(xp0Var.f55710w1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(xp0Var.f55710w1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f55632n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
