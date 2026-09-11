package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zt0;
public final class l0 extends k1 {
    public final Path f45272g3;
    public final zt0 f45273h3;

    public l0(zt0 zt0Var, Context context) {
        super(context);
        this.f45273h3 = zt0Var;
        this.f45272g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        zt0 zt0Var = this.f45273h3;
        barView = zt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, zt0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, zt0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), zt0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), zt0Var.N1));
        Path path = this.f45272g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
