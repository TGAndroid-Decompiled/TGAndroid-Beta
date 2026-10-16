package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gu0;
public final class k0 extends k1 {
    public final Path f44082e3;
    public final gu0 f44083f3;

    public k0(gu0 gu0Var, Context context) {
        super(context);
        this.f44083f3 = gu0Var;
        this.f44082e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        gu0 gu0Var = this.f44083f3;
        barView = gu0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, gu0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, gu0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), gu0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), gu0Var.N1));
        Path path = this.f44082e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
