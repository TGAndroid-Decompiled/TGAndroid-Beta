package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ys0;

public final class i0 extends i1 {

    public final Path f50433c3;

    public final ys0 f50434d3;

    public i0(ys0 ys0Var, Context context) {
        super(context);
        this.f50434d3 = ys0Var;
        this.f50433c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ys0 ys0Var = this.f50434d3;
        ViewGroup barView = ys0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, ys0Var.J1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, ys0Var.J1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), ys0Var.J1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), ys0Var.J1));
        Path path = this.f50433c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
