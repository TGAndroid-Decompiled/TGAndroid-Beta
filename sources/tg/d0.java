package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.vp0;
public final class d0 extends y0 {
    public final Path f57777o3;
    public final vp0 f57778p3;

    public d0(vp0 vp0Var, Context context) {
        super(context);
        this.f57778p3 = vp0Var;
        this.f57777o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        vp0 vp0Var = this.f57778p3;
        barView = vp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f57777o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
