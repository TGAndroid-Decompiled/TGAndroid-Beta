package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tt0;
public final class l0 extends l1 {
    public final Path f41394g3;
    public final tt0 f41395h3;

    public l0(tt0 tt0Var, Context context) {
        super(context);
        this.f41395h3 = tt0Var;
        this.f41394g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        tt0 tt0Var = this.f41395h3;
        barView = tt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, tt0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, tt0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), tt0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), tt0Var.N1));
        Path path = this.f41394g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
