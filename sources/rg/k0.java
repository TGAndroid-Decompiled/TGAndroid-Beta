package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hu0;
public final class k0 extends k1 {
    public final Path f44323e3;
    public final hu0 f44324f3;

    public k0(hu0 hu0Var, Context context) {
        super(context);
        this.f44324f3 = hu0Var;
        this.f44323e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        hu0 hu0Var = this.f44324f3;
        barView = hu0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, hu0Var.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, hu0Var.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), hu0Var.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), hu0Var.N1));
        Path path = this.f44323e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
