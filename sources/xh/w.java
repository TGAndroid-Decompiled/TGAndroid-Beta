package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f46469a;
    public final RectF f46470b;
    public final c0 f46471c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f46471c = c0Var;
        this.f46469a = new RectF();
        this.f46470b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f46471c;
        x xVar = c0Var.f46096a0;
        FrameLayout frameLayout = xVar.f48083b;
        RectF rectF = this.f46469a;
        if (hh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f46097b0;
            RectF rectF2 = this.f46470b;
            if (hh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f48083b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
