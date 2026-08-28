package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class x1 extends c5.c {
    public final Path h;
    public final z1 f50782n;

    public x1(z1 z1Var, Context context) {
        super(context);
        this.f50782n = z1Var;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Path path = this.h;
        path.reset();
        z1 z1Var = this.f50782n;
        if (z1Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -z1Var.I, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + z1Var.I));
        }
        float dp = z1Var.I - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
