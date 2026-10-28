package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pt0;
public final class j0 extends j1 {
    public final Path f48302o3;
    public final pt0 f48303p3;

    public j0(pt0 pt0Var, Context context) {
        super(context);
        this.f48303p3 = pt0Var;
        this.f48302o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        pt0 pt0Var = this.f48303p3;
        barView = pt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, pt0Var.C1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, pt0Var.C1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), pt0Var.C1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), pt0Var.C1));
        Path path = this.f48302o3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
