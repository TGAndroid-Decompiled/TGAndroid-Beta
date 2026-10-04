package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f50300a;
    public final RectF f50301b;
    public final c0 f50302c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f50302c = c0Var;
        this.f50300a = new RectF();
        this.f50301b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f50302c;
        x xVar = c0Var.f49907a0;
        FrameLayout frameLayout = xVar.f52059b;
        RectF rectF = this.f50300a;
        if (hh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f49908b0;
            RectF rectF2 = this.f50301b;
            if (hh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f52059b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
