package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f51026a;
    public final RectF f51027b;
    public final c0 f51028c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f51028c = c0Var;
        this.f51026a = new RectF();
        this.f51027b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f51028c;
        x xVar = c0Var.f50628a0;
        FrameLayout frameLayout = xVar.f1266b;
        RectF rectF = this.f51026a;
        if (ih.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f50629b0;
            RectF rectF2 = this.f51027b;
            if (ih.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f1266b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
