package qh;

import android.graphics.Canvas;
import org.telegram.ui.Components.uk0;
public final class m extends uk0 {
    public b0 f45696e3;
    public a0 f45697f3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.f45697f3 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        b0 b0Var = this.f45696e3;
        if (b0Var != null) {
            b0Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        a0 a0Var = this.f45697f3;
        if (a0Var != null) {
            a0Var.accept(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
