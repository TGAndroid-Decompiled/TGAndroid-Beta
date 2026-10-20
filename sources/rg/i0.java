package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gt0;
public final class i0 extends i1 {
    public final Path f45373e3;
    public final gt0 f45374f3;

    public i0(gt0 gt0Var, Context context) {
        super(context);
        this.f45374f3 = gt0Var;
        this.f45373e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        gt0 gt0Var = this.f45374f3;
        barView = gt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, gt0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, gt0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), gt0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), gt0Var.N1));
        Path path = this.f45373e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
