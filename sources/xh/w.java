package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f46441a;
    public final RectF f46442b;
    public final c0 f46443c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f46443c = c0Var;
        this.f46441a = new RectF();
        this.f46442b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f46443c;
        x xVar = c0Var.f46068a0;
        FrameLayout frameLayout = xVar.f48111b;
        RectF rectF = this.f46441a;
        if (hh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f46069b0;
            RectF rectF2 = this.f46442b;
            if (hh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f48111b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
