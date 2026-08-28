package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xs0;
public final class i0 extends i1 {
    public final Path f49846c3;
    public final xs0 f49847d3;

    public i0(xs0 xs0Var, Context context) {
        super(context);
        this.f49847d3 = xs0Var;
        this.f49846c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        xs0 xs0Var = this.f49847d3;
        barView = xs0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, xs0Var.J1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, xs0Var.J1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), xs0Var.J1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), xs0Var.J1));
        Path path = this.f49846c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
