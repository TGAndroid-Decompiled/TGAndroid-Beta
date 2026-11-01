package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x extends FrameLayout {
    public final RectF f45360a;
    public final RectF f45361b;
    public final d0 f45362c;

    public x(d0 d0Var, Context context) {
        super(context);
        this.f45362c = d0Var;
        this.f45360a = new RectF();
        this.f45361b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f45362c;
        y yVar = d0Var.S1;
        FrameLayout frameLayout = yVar.f47730b;
        RectF rectF = this.f45360a;
        if (zg.h.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.T1;
            RectF rectF2 = this.f45361b;
            if (zg.h.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.i0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.i0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.i0.L(32.0f) / rectF.width(), org.telegram.messenger.i0.L(32.0f) / rectF.height());
                    yVar.f47730b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
