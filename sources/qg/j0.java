package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vt0;
public final class j0 extends i1 {
    public final Path f45094n3;
    public final vt0 f45095o3;

    public j0(vt0 vt0Var, Context context) {
        super(context);
        this.f45095o3 = vt0Var;
        this.f45094n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        vt0 vt0Var = this.f45095o3;
        barView = vt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, vt0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, vt0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), vt0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), vt0Var.N1));
        Path path = this.f45094n3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
