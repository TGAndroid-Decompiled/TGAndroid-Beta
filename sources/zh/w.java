package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class w extends FrameLayout {
    public final RectF f60439a;
    public final RectF f60440b;
    public final c0 f60441c;

    public w(c0 c0Var, Context context) {
        super(context);
        this.f60441c = c0Var;
        this.f60439a = new RectF();
        this.f60440b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f60441c;
        x xVar = c0Var.S1;
        FrameLayout frameLayout = xVar.f3767b;
        RectF rectF = this.f60439a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.T1;
            RectF rectF2 = this.f60440b;
            if (jh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                    xVar.f3767b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
