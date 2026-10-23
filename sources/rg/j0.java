package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jt0;
public final class j0 extends j1 {
    public final Path f45829h3;
    public final jt0 f45830i3;

    public j0(jt0 jt0Var, Context context) {
        super(context);
        this.f45830i3 = jt0Var;
        this.f45829h3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        jt0 jt0Var = this.f45830i3;
        barView = jt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, jt0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, jt0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), jt0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), jt0Var.N1));
        Path path = this.f45829h3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
