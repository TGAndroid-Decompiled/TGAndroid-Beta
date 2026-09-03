package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class g4 extends eg.c2 {
    public final Path f45357d3;
    public final e9 f45358e3;

    public g4(e9 e9Var, Context context) {
        super(context);
        this.f45358e3 = e9Var;
        this.f45357d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        e9 e9Var = this.f45358e3;
        barView = e9Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, e9Var.A1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, e9Var.A1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), e9Var.A1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), e9Var.A1));
        Path path = this.f45357d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
