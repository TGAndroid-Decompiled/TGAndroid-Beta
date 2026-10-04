package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l4;
public final class z1 extends l4 {
    public final Path h;
    public final b2 f46410n;

    public z1(b2 b2Var, Context context) {
        super(context);
        this.f46410n = b2Var;
        this.h = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        b2 b2Var = this.f46410n;
        if (b2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -b2Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + b2Var.M));
        }
        float dp = b2Var.M - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
