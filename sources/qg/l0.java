package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;
public final class l0 extends l1 {
    public final Path f41469g3;
    public final cu0 f41470h3;

    public l0(cu0 cu0Var, Context context) {
        super(context);
        this.f41470h3 = cu0Var;
        this.f41469g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        cu0 cu0Var = this.f41470h3;
        barView = cu0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, cu0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, cu0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), cu0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), cu0Var.N1));
        Path path = this.f41469g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
