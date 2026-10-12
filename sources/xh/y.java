package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends FrameLayout {
    public final RectF f51827a;
    public final RectF f51828b;
    public final e0 f51829c;

    public y(e0 e0Var, Context context) {
        super(context);
        this.f51829c = e0Var;
        this.f51827a = new RectF();
        this.f51828b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f51829c;
        z zVar = e0Var.f51430a0;
        FrameLayout frameLayout = zVar.f53226b;
        RectF rectF = this.f51827a;
        if (hh.j.c(frameLayout, this, rectF)) {
            TextView textView = e0Var.f51431b0;
            RectF rectF2 = this.f51828b;
            if (hh.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    zVar.f53226b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
