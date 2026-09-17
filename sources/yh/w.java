package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f50610a;
    public final RectF f50611b;
    public final c0 f50612c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f50612c = c0Var;
        this.f50610a = new RectF();
        this.f50611b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f50612c;
        x xVar = c0Var.f50216a0;
        FrameLayout frameLayout = xVar.f52618b;
        RectF rectF = this.f50610a;
        if (ih.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f50217b0;
            RectF rectF2 = this.f50611b;
            if (ih.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f52618b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
