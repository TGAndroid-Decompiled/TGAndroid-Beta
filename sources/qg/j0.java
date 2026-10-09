package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bu0;
public final class j0 extends i1 {
    public final Path f46305e3;
    public final bu0 f46306f3;

    public j0(bu0 bu0Var, Context context) {
        super(context);
        this.f46306f3 = bu0Var;
        this.f46305e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        bu0 bu0Var = this.f46306f3;
        barView = bu0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, bu0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, bu0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), bu0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), bu0Var.N1));
        Path path = this.f46305e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
