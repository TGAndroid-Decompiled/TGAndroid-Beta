package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f50307a;
    public final RectF f50308b;
    public final c0 f50309c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f50309c = c0Var;
        this.f50307a = new RectF();
        this.f50308b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f50309c;
        x xVar = c0Var.f49914a0;
        FrameLayout frameLayout = xVar.f52129b;
        RectF rectF = this.f50307a;
        if (hh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f49915b0;
            RectF rectF2 = this.f50308b;
            if (hh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f52129b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
