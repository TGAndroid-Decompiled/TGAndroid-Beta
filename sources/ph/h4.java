package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class h4 extends dg.e2 {
    public final Path f41743d3;
    public final h9 f41744e3;

    public h4(h9 h9Var, Context context) {
        super(context);
        this.f41744e3 = h9Var;
        this.f41743d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        h9 h9Var = this.f41744e3;
        barView = h9Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, h9Var.A1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, h9Var.A1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), h9Var.A1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), h9Var.A1));
        Path path = this.f41743d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
