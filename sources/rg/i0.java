package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.it0;
public final class i0 extends i1 {
    public final Path f45398e3;
    public final it0 f45399f3;

    public i0(it0 it0Var, Context context) {
        super(context);
        this.f45399f3 = it0Var;
        this.f45398e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        it0 it0Var = this.f45399f3;
        barView = it0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, it0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, it0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), it0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), it0Var.N1));
        Path path = this.f45398e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
