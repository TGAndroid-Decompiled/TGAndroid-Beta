package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f50560a;
    public final RectF f50561b;
    public final c0 f50562c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f50562c = c0Var;
        this.f50560a = new RectF();
        this.f50561b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f50562c;
        x xVar = c0Var.f50177a0;
        FrameLayout frameLayout = xVar.f1216b;
        RectF rectF = this.f50560a;
        if (ih.j.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f50178b0;
            RectF rectF2 = this.f50561b;
            if (ih.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f1216b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
