package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nt0;
public final class k0 extends k1 {
    public final Path f48273o3;
    public final nt0 f48274p3;

    public k0(nt0 nt0Var, Context context) {
        super(context);
        this.f48274p3 = nt0Var;
        this.f48273o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        nt0 nt0Var = this.f48274p3;
        barView = nt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, nt0Var.C1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, nt0Var.C1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), nt0Var.C1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), nt0Var.C1));
        Path path = this.f48273o3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
