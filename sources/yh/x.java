package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x extends FrameLayout {
    public final RectF f50620a;
    public final RectF f50621b;
    public final d0 f50622c;

    public x(d0 d0Var, Context context) {
        super(context);
        this.f50622c = d0Var;
        this.f50620a = new RectF();
        this.f50621b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f50622c;
        y yVar = d0Var.f50241a0;
        FrameLayout frameLayout = yVar.f1213b;
        RectF rectF = this.f50620a;
        if (ih.j.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.f50242b0;
            RectF rectF2 = this.f50621b;
            if (ih.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    yVar.f1213b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
