package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w extends FrameLayout {
    public final RectF f53365a;
    public final RectF f53366b;
    public final c0 f53367c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f53367c = c0Var;
        this.f53365a = new RectF();
        this.f53366b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f53367c;
        x xVar = c0Var.f52972a0;
        FrameLayout frameLayout = xVar.f4345b;
        RectF rectF = this.f53365a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.f52973b0;
            RectF rectF2 = this.f53366b;
            if (jh.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    xVar.f4345b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
