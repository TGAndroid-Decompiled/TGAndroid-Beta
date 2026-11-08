package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class v extends FrameLayout {
    public final RectF f60544a;
    public final RectF f60545b;
    public final b0 f60546c;

    public v(b0 b0Var, Context context) {
        super(context);
        this.f60546c = b0Var;
        this.f60544a = new RectF();
        this.f60545b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f60546c;
        w wVar = b0Var.S1;
        FrameLayout frameLayout = wVar.f3767b;
        RectF rectF = this.f60544a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = b0Var.T1;
            RectF rectF2 = this.f60545b;
            if (jh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                    wVar.f3767b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
