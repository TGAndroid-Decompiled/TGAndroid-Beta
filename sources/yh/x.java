package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x extends FrameLayout {
    public final RectF f49190a;
    public final RectF f49191b;
    public final d0 f49192c;

    public x(d0 d0Var, Context context) {
        super(context);
        this.f49192c = d0Var;
        this.f49190a = new RectF();
        this.f49191b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f49192c;
        y yVar = d0Var.f48809a0;
        FrameLayout frameLayout = yVar.f50909b;
        RectF rectF = this.f49190a;
        if (ih.j.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.f48810b0;
            RectF rectF2 = this.f49191b;
            if (ih.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    yVar.f50909b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
