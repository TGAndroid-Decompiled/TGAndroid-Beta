package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l4;
public final class a2 extends l4 {
    public final Path h;
    public final c2 f46021n;

    public a2(c2 c2Var, Context context) {
        super(context);
        this.f46021n = c2Var;
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
        c2 c2Var = this.f46021n;
        if (c2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -c2Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + c2Var.M));
        }
        float dp = c2Var.M - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
