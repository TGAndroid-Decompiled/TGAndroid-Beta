package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x extends FrameLayout {
    public final RectF f44422a;
    public final RectF f44423b;
    public final d0 f44424c;

    public x(d0 d0Var, Context context) {
        super(context);
        this.f44424c = d0Var;
        this.f44422a = new RectF();
        this.f44423b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f44424c;
        y yVar = d0Var.f44047a0;
        FrameLayout frameLayout = yVar.f46099b;
        RectF rectF = this.f44422a;
        if (gh.k.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.f44048b0;
            RectF rectF2 = this.f44423b;
            if (gh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    yVar.f46099b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
