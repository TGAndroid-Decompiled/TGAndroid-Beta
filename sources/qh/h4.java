package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class h4 extends eg.c2 {
    public final Path f45376d3;
    public final f9 f45377e3;

    public h4(f9 f9Var, Context context) {
        super(context);
        this.f45377e3 = f9Var;
        this.f45376d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        f9 f9Var = this.f45377e3;
        barView = f9Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, f9Var.A1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, f9Var.A1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), f9Var.A1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), f9Var.A1));
        Path path = this.f45376d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
