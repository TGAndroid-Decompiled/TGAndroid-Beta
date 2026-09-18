package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;
public final class j0 extends i1 {
    public final Path f41675g3;
    public final au0 f41676h3;

    public j0(au0 au0Var, Context context) {
        super(context);
        this.f41676h3 = au0Var;
        this.f41675g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        au0 au0Var = this.f41676h3;
        barView = au0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, au0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, au0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), au0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), au0Var.N1));
        Path path = this.f41675g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
