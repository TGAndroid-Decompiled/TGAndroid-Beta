package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.tp0;
public final class d0 extends y0 {
    public final Path f57184o3;
    public final tp0 f57185p3;

    public d0(tp0 tp0Var, Context context) {
        super(context);
        this.f57185p3 = tp0Var;
        this.f57184o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        tp0 tp0Var = this.f57185p3;
        barView = tp0Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(tp0Var.f57302x1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(tp0Var.f57302x1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(tp0Var.f57302x1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(tp0Var.f57302x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f57184o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
