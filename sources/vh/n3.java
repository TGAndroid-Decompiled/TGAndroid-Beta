package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class n3 extends jg.n1 {
    public final Path f51505n3;
    public final s7 f51506o3;

    public n3(s7 s7Var, Context context) {
        super(context);
        this.f51506o3 = s7Var;
        this.f51505n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        s7 s7Var = this.f51506o3;
        barView = s7Var.getBarView();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.W1(s7Var.f50975m1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.i0.W1(s7Var.f50975m1, barView.getTop() - getTop(), 0), org.telegram.messenger.i0.W1(s7Var.f50975m1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.i0.W1(s7Var.f50975m1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f51505n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
