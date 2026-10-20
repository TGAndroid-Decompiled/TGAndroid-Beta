package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.jm0;
public final class m extends jm0 {
    public e0 V2;
    public d0 W2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.W2 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        e0 e0Var = this.V2;
        if (e0Var != null) {
            e0Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        d0 d0Var = this.W2;
        if (d0Var != null) {
            d0Var.accept(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
