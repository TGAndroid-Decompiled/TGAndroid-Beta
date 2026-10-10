package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends FrameLayout {
    public final RectF f51649a;
    public final RectF f51650b;
    public final e0 f51651c;

    public y(e0 e0Var, Context context) {
        super(context);
        this.f51651c = e0Var;
        this.f51649a = new RectF();
        this.f51650b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f51651c;
        z zVar = e0Var.f51255a0;
        FrameLayout frameLayout = zVar.f53046b;
        RectF rectF = this.f51649a;
        if (hh.j.c(frameLayout, this, rectF)) {
            TextView textView = e0Var.f51256b0;
            RectF rectF2 = this.f51650b;
            if (hh.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    zVar.f53046b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
