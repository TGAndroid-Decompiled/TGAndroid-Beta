package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.im0;
public final class s extends im0 {
    public g0 V2;
    public f0 W2;

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
        g0 g0Var = this.V2;
        if (g0Var != null) {
            g0Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        f0 f0Var = this.W2;
        if (f0Var != null) {
            f0Var.accept(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
