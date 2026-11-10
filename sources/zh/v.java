package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class v extends FrameLayout {
    public final RectF f60573a;
    public final RectF f60574b;
    public final b0 f60575c;

    public v(b0 b0Var, Context context) {
        super(context);
        this.f60575c = b0Var;
        this.f60573a = new RectF();
        this.f60574b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f60575c;
        w wVar = b0Var.V1;
        FrameLayout frameLayout = wVar.f3764b;
        RectF rectF = this.f60573a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = b0Var.W1;
            RectF rectF2 = this.f60574b;
            if (jh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                    wVar.f3764b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
