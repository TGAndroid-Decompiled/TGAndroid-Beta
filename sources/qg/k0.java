package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.st0;
public final class k0 extends j1 {
    public final Path f41709g3;
    public final st0 f41710h3;

    public k0(st0 st0Var, Context context) {
        super(context);
        this.f41710h3 = st0Var;
        this.f41709g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        st0 st0Var = this.f41710h3;
        barView = st0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, st0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, st0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), st0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), st0Var.N1));
        Path path = this.f41709g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
